package HomeWork9.Task4;

import java.io.*;

public class App {
    public static void main(String[] args) {
        try (ObjectOutputStream carSerialization = new ObjectOutputStream(new FileOutputStream("Car.txt"))) {
            Car car1 = new Car("BMW", 100, 5000);
            carSerialization.writeObject(car1);
            Car car2 = new Car("Audi", 80, 7000);
            carSerialization.writeObject(car2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream carDessiralization = new ObjectInputStream(new FileInputStream("Car.txt"))) {
            Car car1 = (Car) carDessiralization.readObject();
            Car car2 = (Car) carDessiralization.readObject();
            System.out.println("Brand: " + car1.getBrand() + ", " + "Speed: " + car1.speed + "км/ч, " + "Price: " + car1.getPrice()+ "$");
            System.out.println("Brand: " + car2.getBrand() + ", " + "Speed: " + car2.speed + "км/ч, " + "Price: " + car2.getPrice()+ "$");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
