
package webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
        "id",
        "model",
        "mileage",
        "condition",
        "user",
        "days",
        "price"
})
public class Car {

    protected int id;
    protected String model;
    protected int mileage;
    protected String condition;
    protected String user;
    protected int days;
    protected int price;


    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String value) {
        this.model = value;
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int value) {
        this.mileage = value;
    }


    public String getCondition() {
        return condition;
    }

    public void setCondition(String value) {
        this.condition = value;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int value) {
        this.days = value;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int value) {
        this.price = value;
    }
}
