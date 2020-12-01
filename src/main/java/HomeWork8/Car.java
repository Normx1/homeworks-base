package HomeWork8;

import java.util.ArrayList;
import java.util.Random;

class MyExeption extends Exception {
    private int a;

    MyExeption(int a) {
        this.a = a;
    }
}

public class Car {
    private  String brand;
    int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }


    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    static void Start(String brand) throws MyExeption {

        Random r = new Random();
        int pusk = r.nextInt(20);
        System.out.println("random- " + pusk);
        if (pusk % 2 != 0)
            throw new MyExeption(pusk);
        System.out.printf("Car brand %s is not started ", brand);
        System.out.println();
    }


    public static void main(String[] args) throws MyExeption {

        Car car1 = new Car("BMW", 120, 50000);
        Car car2 = new Car("Audi", 100, 40000);
        Car car3 = new Car("Moskvich", 55, 400);
        ArrayList<Car> carShop = new ArrayList<>();
        carShop.add(car1);
        carShop.add(car2);
        carShop.add(car3);

        for (int i = 0; i < carShop.size(); i++) {
            carShop.get(i);
            try {
              Start(carShop.get(i).brand);
            } catch (MyExeption e) {
                System.out.printf("Car brand %s is started ", carShop.get(i).brand);
                System.out.println();
            }
        }
    }
}

