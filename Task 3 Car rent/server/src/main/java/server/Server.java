package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Arrays;

@WebService
public class Server {
    
    private Cars carsdb;

    public Server() {
        carsdb = new Cars();
    }

    @WebMethod
    public Car[] getAllCars() {
        return carsdb.getAllCars();
    }

    @WebMethod
    public Car[] takeModel(String model) {
        return carsdb.takeModel(model);
    }

    @WebMethod
    public int takeCar(int id, String user, int days) {
        return carsdb.takeCar(id, user, days);
    }

    @WebMethod
    public int addCar(String model, int mileage, String condition, int price) {
        return carsdb.addCar(model, mileage, condition, price);
    }

    @WebMethod
    public void deleteCar(int id) {
        carsdb.deleteCar(id);
    }

    @WebMethod
    public void changeSpecification(int id, int mileage, String condition, int price) {
        carsdb.changeSpecifications(id, mileage, condition, price);
    }

    @WebMethod
    public void changeUser(int id, String user, int days) {
        carsdb.changeUser(id, user, days);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/Server", new Server());
    }

}
