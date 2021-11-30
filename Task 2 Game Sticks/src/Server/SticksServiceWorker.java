package Server;

import Server.SticksService;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import static resources.constants.Constants.*;

public class SticksServiceWorker {
    public static void main(String[] args) {
        try {
            System.out.print("Введите размер доски (может быть больше 3): ");
            final int size = new Scanner(System.in).nextInt();
            final SticksService server = new SticksService(size);
            System.out.println("Инициализируем " + SERVICE_NAME);

            final Registry registry = LocateRegistry.createRegistry(SERVICE_PORT_PUBLISH);
            final Remote stub = UnicastRemoteObject.exportObject(server, SERVICE_PORT_PUBLISH);
            registry.bind(SERVICE_NAME, stub);

            System.out.println("Сервис \"" + SERVICE_NAME + "\" был запущен!");
        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Получено исключение: " + e.getMessage());
            System.exit(1);
        }
    }
}

