package server;

public class Car {
    
    public int id;
    public String model;
    public int mileage;
    public String condition;
    public String user;
    public int days;
    public int price;

    public Car() {}

    public Car(int id, String model, int mileage, String condition, String user, int days, int price) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.condition = condition;
        this.user = user;
        this.days = days;
        this.price = price;
    }
}
