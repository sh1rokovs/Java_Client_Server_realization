package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import webservice.service.Car;
import webservice.service.Server;
import webservice.service.ServerService;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        Server serverPort = new ServerService(new URL("http://localhost:8080/Server?wsdl")).getServerPort();
        Scanner in = new Scanner(System.in);
        int work = 1;
        while (work != 0) {
            System.out.println("//////////////////" +
                    "\nChoose an action:" +
                    "\n1. Get all cars" +
                    "\n2. Get car model" +
                    "\n3. Rent car" +
                    "\n4. Return car" +
                    "\n0. Exit" +
                    "\n//////////////////");
            work = in.nextInt();
            switch (work) {
                case 1: {
                    ArrayList<Car> cars = new ArrayList<>(serverPort.getAllCars());
                    for (Car car : cars) {
                        System.out.println("*-----------------------*" +
                                "\nId: " + car.getId() +
                                "\nModel: " + car.getModel() +
                                "\nMileage: " + car.getMileage() +
                                "\nCondition: " + car.getCondition() +
                                "\nUser: " + car.getUser() +
                                "\nDays: " + car.getDays() +
                                "\nPrice: " + car.getPrice() +
                                "\n*-----------------------*");
                    }
                    break;
                }
                case 2: {
                    in.nextLine();
                    System.out.println("Input car model:");
                    String model = in.nextLine();
                    System.out.println(model);
                    ArrayList<Car> cars = new ArrayList<>(serverPort.takeModel(model));
                    for (Car car : cars) {
                        if(car.getModel() != null) {
                            System.out.println("*-----------------------*" +
                                    "\nId: " + car.getId() +
                                    "\nModel: " + car.getModel() +
                                    "\nMileage: " + car.getMileage() +
                                    "\nCondition: " + car.getCondition() +
                                    "\nUser: " + car.getUser() +
                                    "\nDays: " + car.getDays() +
                                    "\nPrice: " + car.getPrice() +
                                    "\n*-----------------------*");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Input car id:");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.println("Input your name:");
                    String name = in.nextLine();
                    System.out.println("Input count days:");
                    int days = in.nextInt();
                    System.out.println("Car was rented! Your check is: " + serverPort.takeCar(id, name, days));
                    break;
                }
                case 4: {
                    in.nextLine();
                    System.out.println("Input car id:");
                    int id = in.nextInt();
                    serverPort.changeUser(id, "None", 0);
                    System.out.println("Car was return");
                    break;
                }
                default:
                    break;
            }
        }
        in.close();
    }
}
