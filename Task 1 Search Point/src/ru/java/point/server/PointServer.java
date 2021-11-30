package ru.java.point.server;

import ru.java.point.network.TCPConnection;
import ru.java.point.network.TCPConnectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class PointServer extends JFrame implements TCPConnectionListener {
    String pointer = "(0,0)";
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public static void main(String[] args) {
        new PointServer();
    }

    private  final ArrayList<TCPConnection> connections = new ArrayList<>();

    private final JTextArea log = new JTextArea(20, 20);
    private final JLabel l1 = new JLabel("Server");

    private PointServer() {
        System.out.println("Server running...");
        printMsg("Server started!");
        printMsg("----------------------------------------------");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        log.setEditable(false);
        log.setLineWrap(true);
        //fieldInput.addActionListener(this);

        add(l1, BorderLayout.NORTH);
        add(log, BorderLayout.CENTER);

        setVisible(true);

        try(ServerSocket serverSocket = new ServerSocket(8000)) {
            while (true) {
                try {
                    new TCPConnection(this, serverSocket.accept());
                } catch (IOException e) {
                    System.out.println("TCPConnection exception: " + e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        connections.add(tcpConnection);
        sendToAllConnections("Client connected: " + tcpConnection);
        printMsg("Client connected: " + tcpConnection);
        printMsg("----------------------------------------------");
        /*sendToAllConnections("--------------\n");
        sendToAllConnections("Текущая точка: 1.\nЗадать свою точку: 2.\n");*/
    }

    @Override
    public synchronized void onReceiveString(TCPConnection tcpConnection, String value) {
        sendToAllConnections(value);
        if(value.equals("1")) {
            printMsg("Текущая точка: " + this.pointer);
        }
        if (value.charAt(0) == '2') {
            printMsg("Запрос на новую точку: " + value.substring(1, value.length()));
        }
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        connections.remove(tcpConnection);
        sendToAllConnections("Client disconnected: " + tcpConnection);
        printMsg("Client disconnected: " + tcpConnection);
    }

    @Override
    public synchronized void onException(TCPConnection tcpConnection, Exception e) {
        System.out.println("TCPConnection exception: " + e);
        printMsg("TCPConnection exception: " + e);
    }

    private synchronized void printMsg(String msg) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                log.append(msg + "\r\n");
                log.setCaretPosition(log.getDocument().getLength());
            }
        });
    }

    private void sendToAllConnections(String value) {
        //System.out.println(value);
        final int cnt = connections.size();
        if (value.equals("1")) {
            System.out.println("Текущая точка: " + this.pointer);
            for (int i = 0; i < cnt; i++) connections.get(i).sendString("Текущая точка: " + this.pointer);
        } else if (value.charAt(0) == '2') {
            this.pointer = value.substring(1, value.length());
            for (int i = 0; i < cnt; i++) connections.get(i).sendString("Новая точка: " + value.substring(1, value.length()));
        } else {
            for (int i = 0; i < cnt; i++) connections.get(i).sendString(value);
        }
    }
}
