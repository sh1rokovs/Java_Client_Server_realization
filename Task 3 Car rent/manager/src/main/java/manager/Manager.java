package manager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import webservice.service.Server;
import webservice.service.ServerService;
import webservice.service.Car;

public class Manager {
    public static void main(String[] args) throws MalformedURLException {
        Server serverPort = new ServerService(new URL("http://localhost:8080/Server?wsdl")).getServerPort();
        Scanner in = new Scanner(System.in);
        int work = 1;
        while (work != 0) {
            System.out.println("//////////////////" +
                    "\nChoose an action:" +
                    "\n1. Get all cars" +
                    "\n2. Get car model" +
                    "\n3. New car" +
                    "\n4. Change specifications" +
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
                    in.nextLine();
                    System.out.println("Input model:");
                    String model = in.nextLine();
                    System.out.println("Input mileage:");
                    String mileage = in.nextLine();
                    System.out.println("Input condition:");
                    String condition = in.nextLine();
                    System.out.println("Input price:");
                    int price = Integer.parseInt(in.nextLine());
                    System.out.println("Car id: " + serverPort.addCar(model, mileage, condition, price));
                    break;
                }
                case 4: {
                    in.nextLine();
                    System.out.println("Input id car:");
                    int id = Integer.parseInt(in.nextLine());
                    System.out.println("Input mileage:");
                    String mileage = in.nextLine();
                    System.out.println("Input condition:");
                    String condition = in.nextLine();
                    System.out.println("Input price:");
                    int price = in.nextInt();
                    serverPort.changeSpecification(id, mileage, condition, price);
                    System.out.println("Specifications changed.");
                    break;
                }
                default:
                    break;
            }
        }
        in.close();
    }
}
