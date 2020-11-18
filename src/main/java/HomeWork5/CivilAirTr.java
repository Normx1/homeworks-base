package HomeWork5;

import java.util.Scanner;

public class CivilAirTr {
    public int numPass;
    public boolean haveBuissClass;

    public CivilAirTr(int numPass, boolean haveBuissClass) {
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
}