package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Cars {
    
    private int nextId;
    private HashMap<Integer, Car> cars;

    public Cars() {
        nextId = 0;
        cars = new HashMap<>();
    }

    public Car[] getAllCars() {
        return cars.values().toArray(Car[]::new);
    }

    public Car[] takeModel(String model) {
        Car[] fewCar = new Car[nextId];
        for(int i = 0; i < nextId; i++){
            if(cars.get(i).model.equals(model)){
                fewCar[i] = cars.get(i);
            }
        }
        return fewCar;
    }

    public int takeCar(int id, String user, int days) {
        cars.get(id).user = user;
        cars.get(id).days = days;
        return cars.get(id).price * days;
    }

    public int addCar(String model, int mileage, String condition, int price) {
        cars.put(nextId, new Car(nextId, model, mileage, condition, "None", 0, price));
        return nextId++;
    }

    public void deleteCar(int id) {
        cars.remove(id);
    }

    public void changeSpecifications(int id, int mileage, String condition, int price) {
        if (cars.containsKey(id)) {
            cars.get(id).mileage = mileage;
            cars.get(id).condition = condition;
            cars.get(id).price = price;
        }
    }

    public void changeUser(int id, String user, int days) {
        if (cars.containsKey(id)) {
            cars.get(id).user = user;
            cars.get(id).days = days;
        }
    }
}
