package HomeWork5;

import java.util.Scanner;

public class Cargo {

    public int carrying;
    Cargo(int carrying) {
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
}
