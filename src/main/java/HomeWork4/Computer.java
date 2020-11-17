package HomeWork4;

import java.util.Random;
import java.util.Scanner;

class Computer {

    private String CPU;
    private String RAM;
    private String HDD;
    static private int numSource;
    int burnUp = 0;

    private Computer(String CPU, String RAM, String HDD, int source) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.numSource = source;
    }

    public void dyspalayInfo() {
        System.out.printf("Processor: %s \n RAM: %s\n Hard Drive %s\n Resource: %d\n ", CPU, RAM, HDD, numSource);
    }

    public static void main(String[] args) {
        System.out.println("Введите характеристики Comp:");
        System.out.println("CPU: ");
        Scanner sc1 =new Scanner(System.in);
        String CPU =sc1.nextLine();
        System.out.println("RAM: ");
        Scanner sc2 =new Scanner(System.in);
        String RAM =sc2.nextLine();
        System.out.println("HDD: ");
        Scanner sc3 =new Scanner(System.in);
        String HDD =sc3.nextLine();
        System.out.println("Source: ");
        Scanner sc4 =new Scanner(System.in);
        int source = sc4.nextInt();

       Computer Comp = new Computer(CPU,RAM, HDD, source);
//        Computer Comp = new Computer("Ryzen 3", "Kingston", "HITACHI 1000GB", 3);
        Comp.dyspalayInfo();
        while (numSource!=0) {
            Comp.turnOn();
            Comp.turnOff();
            Comp.source(numSource);
        }

    }

    public void turnOn() {

        System.out.println("Вы хотите включить компьютер?");
        Scanner scOn = new Scanner(System.in);
        Boolean turnOn = scOn.nextBoolean();
        if (numSource > 0) {
            Random r = new Random();
            boolean vkl = r.nextBoolean();
            if (turnOn == false) {
                System.out.println("Компьютер включен");
                numSource--;
            } else {
                numSource = 0;
            }
        }
    }

    public void turnOff() {
        if (numSource != 0) {
        System.out.println("Вы хотите выключить компьютер?");
        Scanner scOff = new Scanner(System.in);
        Boolean turnOff = scOff.nextBoolean();
            Random r = new Random();
            boolean vkl = r.nextBoolean();
            if (turnOff == vkl) {
                System.out.println("Компьютер выключен");
                numSource--;
            } else {
                numSource = 0;
            }
        }
    }

    public static void source(int numSource) {
        if (numSource == 0) {
            System.out.println("Компьютер сгорел");
        }
    }
}

