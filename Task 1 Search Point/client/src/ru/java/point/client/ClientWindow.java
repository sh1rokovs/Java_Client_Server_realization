package ru.java.point.client;

import ru.java.point.network.TCPConnection;
import ru.java.point.network.TCPConnectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ClientWindow extends JFrame implements ActionListener, TCPConnectionListener {

    private static final String IP_ADDR = "localhost";
    private static final int PORT = 8000;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientWindow();
            }
        });
    }

    private final JTextArea log = new JTextArea(20, 20);
    private final JLabel l1 = new JLabel("x:");
    private final JLabel l2 = new JLabel("y:");
    private final JLabel l3 = new JLabel("                        ");
    private final JButton b1 = new JButton("Текущая координата");
    private final JButton b2 = new JButton("Задать координату");
    private final JTextField t2 = new JTextField(10);
    private final JTextField t1 = new JTextField(10);

    private TCPConnection connection;

    private ClientWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        log.setEditable(false);
        log.setLineWrap(true);
        //fieldInput.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = t1.getText();
                String y = t2.getText();
                connection.sendString("2(" + x + "," + y + ")");
                t1.setText(null);
                t2.setText(null);
            }
        });

        add(log);
        add(b1);
        add(l3);
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);


        setVisible(true);
        try {
            connection = new TCPConnection(this, IP_ADDR, PORT);
        } catch (IOException e) {
            printMsg("Connection exception: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e);
        connection.sendString("1");
        /*String msg = fieldInput.getText();
        if(msg.equals("")) return;
        fieldInput.setText(null);*/
    }


    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        printMsg("Connection ready...");
    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String value) {
        printMsg(value);
    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        printMsg("Connection close");
    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        printMsg("Connection exception: " + e);
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

}
