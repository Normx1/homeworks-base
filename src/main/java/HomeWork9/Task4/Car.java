package HomeWork9.Task4;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    int speed;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int speed, int price)  {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }}
