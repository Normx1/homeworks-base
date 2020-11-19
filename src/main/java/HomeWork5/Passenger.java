package HomeWork5;

import java.util.Scanner;

public class Passenger extends LandTransport {
    public String typeBody;
    public int numOfPass;

    public Passenger(int power, int maxSpeed, int weight, String model, int numOfWeels, int fuelCons, String typeBody, int numOfPass) {
        super(power, maxSpeed, weight, model, numOfWeels, fuelCons);
        this.typeBody = typeBody;
        this.numOfPass = numOfPass;
    }

    public void distance(int maxSpeed) {
        System.out.println("Введите время пути");
        Scanner sc1 = new Scanner(System.in);
        int time = sc1.nextInt();
        int dist = maxSpeed * time;
        fuelConsumption(time, fuelCons);

    }
    private void fuelConsumption( int time, int fuelCons ) {
        int cons = fuelCons * time;
        int dist = maxSpeed * time;
        System.out.printf("За время %s ч, автомобиль %s двигаясь с максимальной скоростью %s км/ч " +
                "проедет %s км и израсходует %s литров топлива.", time, model, maxSpeed, dist, cons);

    }

    public void allOptions(){
         double powerKB = power*0.74;
        System.out.printf("Мощность в л/с %s\n Мощность в Кв %s\n Максимальная скорость(км/ч) %s\n Масса" +
                " (кг) %s\n Марка %s\n Количество колес %s\n Расход топлива (л/100км) %s\n" +
                " Тип кузова %s\n Количество пассажиров %s\n",   power, powerKB, maxSpeed,
                weight, model, numOfWeels,  fuelCons, typeBody, numOfPass );
    }
}