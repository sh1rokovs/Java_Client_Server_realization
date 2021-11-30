package Client;

import Server.ISticksService;
import resources.components.Player;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import static resources.constants.Constants.*;

public class Client_1 {
    private Player player;
    private ISticksService service;
    private Scanner userInput;

    public Client_1() {
        try {
            this.userInput = new Scanner(System.in);
            initializeService();
            assert service != null;
            initializePlayer(service);

            boolean isWaiting = false;
            while (!service.isGameOver()) {
                if (service.isMyTurn(player)) {
                    service.getBoard().printBoard();
                    System.out.println("Your move, " + player.getName() + "!");
                    String move = userInput.next();
                    service.setPlayerNewLink(this.player, move);
                    isWaiting = false;
                } else {
                    if (!isWaiting) {
                        System.out.println("Waiting for another player...");
                        isWaiting = true;
                    }
                }
                Thread.sleep(REQUEST_TIME);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.exit(0);
    }

    void initializePlayer(ISticksService service) throws RemoteException {
        System.out.print("Hello! Welcome to the game named \"Sticks\"!\nWrite your name below: ");
        String name = userInput.next();
        this.player = service.addPlayer(name);
    }

    void initializeService() throws NotBoundException, RemoteException {
        final Registry registry = LocateRegistry.getRegistry(SERVICE_PORT_PUBLISH);
        this.service = (ISticksService) registry.lookup(SERVICE_NAME);
    }
}