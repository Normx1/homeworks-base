package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        new Ncomp();
    }
}
    class Ncomp {
        // Метод описания
        static void dyspalayInfo() {
            System.out.println("Введите процессор: ");
            Scanner sc1= new Scanner(System.in);
            String processor = sc1.nextLine();
            System.out.println("Введите оперативную память: ");
            Scanner sc2= new Scanner(System.in);
            String ram = sc2.nextLine();
            System.out.println("Введите жесткий диск: ");
            Scanner sc3= new Scanner(System.in);
            String hardDrive = sc3.nextLine();
            System.out.println("Введите количество циклов работы: ");
            Scanner sc4= new Scanner(System.in);
            int resource = sc3.nextInt();

            System.out.printf("Processor: %c \n + ram: %d\n+ +Hard Drive %e\n+ resource: %f\n ", processor , ram, hardDrive, resource);
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

        static void Close() {
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

        static void resurses() {


        }
    }

