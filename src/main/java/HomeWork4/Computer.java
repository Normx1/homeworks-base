package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    int processor;
    int ram;
    int hardDrive;
    Boolean staus;

    // Метод описания
    static void dyspalay(String a) {
        System.out.println(a);
    }

    static void Vkl(int b) {
        int rand = 0;
        int vvod = 0;
        String vkl;
        System.out.println("Включить компьютер Yes/No?");
        Scanner vklsc = new Scanner(System.in);
        vkl = vklsc.nextLine();
        if (vkl == "Yes") {
            System.out.println("Упс- сбой... Необходимо ввести число 1 или 0, чтобы спасти комп!");
            Random r = new Random();
            Scanner sc = new Scanner(System.in);
            rand = r.nextInt(2);
            vvod = sc.nextInt();
            if (rand == vvod) {
                System.out.println("Угадал! Компьютер всего-то выключился!");
            } else {
                System.out.println("Не угадал, компьютер- сгорел");
            }
        } else {
            System.out.println("Компьютер выключен");
        }

    }

    static void Close(int b) {
        int rand = 0;
        int vvod = 0;
        String off;
        System.out.println("Выключить компьютер Yes/No?");
        Scanner vklsc = new Scanner(System.in);
        off = vklsc.nextLine();
        if (off == "Yes") {
            System.out.println("Упс- сбой... Необходимо ввести число 1 или 0, чтобы спасти комп!");
            Random r = new Random();
            Scanner sc = new Scanner(System.in);
            rand = r.nextInt(2);
            vvod = sc.nextInt();
            if (rand == vvod) {
                System.out.println("Угадал! Компьютер всего-то выключился!");
            } else {
                System.out.println("Не угадал, компьютер- сгорел");
            }
        } else {
            System.out.println("Компьютер продолжает работать");
        }
    }
}

