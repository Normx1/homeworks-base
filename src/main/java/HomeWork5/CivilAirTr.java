package HomeWork5;

import java.util.Scanner;

public class CivilAirTr extends AirTransport {
    public int numPass;
    public boolean haveBuissClass;

    public CivilAirTr(int power, int maxSpeed, int weight, String model, int spamWings, int length, int numPass, boolean haveBuissClass) {
        super(power, maxSpeed, weight, model, spamWings, length);
        this.numPass = numPass;
        this.haveBuissClass = haveBuissClass;
    }

    public void airPass(int numPass) {
        System.out.println("Введите количество пассажиров:");
        Scanner sc1 = new Scanner(System.in);
        int factNumPass = sc1.nextInt();
        if (numPass <= factNumPass) {
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
    public void allOptions(){
        double powerKB = power*0.74;
        System.out.printf("Мощность в л/с %s\n Мощность в Кв %s\n Максимальная скорость (км/ч)%s\n Масса (кг)%s\n Размах крыльев %s\n Минимальная длинна взлетно посадочной полосы %s\n Кол-во пассажиров %s\n Наличие бизнесс класса %s ",   power, powerKB, maxSpeed,  weight, model, spamWings, length, numPass, haveBuissClass );
    }
}