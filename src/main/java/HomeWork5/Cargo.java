package HomeWork5;

import java.util.Scanner;

public class Cargo extends LandTransport {
    public int carrying;

    public Cargo(int power, int maxSpeed, int weight, String model, int numOfWeels, int fuelCons, int carrying) {
        super(power, maxSpeed, weight, model, numOfWeels, fuelCons);
        this.carrying = carrying;
    }

    public void carMass(int carrying){
        System.out.println("Введите грузоподъемность:");
        Scanner sc1= new Scanner(System.in);
        int weightСargo = sc1.nextInt();
        if (carrying <= weightСargo){
            System.out.println("Грузовик загружен.");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }

    }
    public void allOptions(){
        double powerKB = power*0.74;
        System.out.printf("Мощность в л/с %s\n Мощность в Кв %s\n Максимальная скорость (км/ч)%s\n Масса (кг)%s\n Марка Количество колес%s\n Расход топлива (л/100км)%s\n Грузоподъемность %s\n",   power, powerKB, maxSpeed,  weight, model, numOfWeels,  fuelCons, carrying );
    }
}
