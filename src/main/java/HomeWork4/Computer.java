package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    int processor;
    int ram;
    int hardDrive;
    Boolean staus;

// Метод описания
      static void dyspalay(String a){
        System.out.println(a);
    }

    static  void Vkl(int b){
        int rand = 0;
        int vvod = 0;
        System.out.println("Включить компьютер");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        rand = r.nextInt(1);
        vvod = sc.nextInt();
        if(rand == vvod){
            System.out.println("Угадал!.Компьютер всего-то выключился!");
        }else{
            System.out.println("Не угадал, компьютер- сгорел");
        }

    }
}

