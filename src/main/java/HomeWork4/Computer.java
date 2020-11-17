package HomeWork4;

import java.util.Random;

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
        Computer Comp = new Computer("Ryzen 3", "Kingston", "HITACHI 1000GB", 2);
        Comp.dyspalayInfo();
        Comp.turnOn(true);
        Comp.turnOff(true);
        Comp.source(numSource);

    }

    public void turnOn(boolean turn) {
//        if (turn == false){
//            System.out.println("Компьютер выключен");
//    }
        Random r = new Random();
        boolean vkl = r.nextBoolean();
        if (turn == vkl) {
            System.out.println("Компьютер выключен");
            numSource--;
        } else {
            Computer.source(numSource = 0);
        }
    }

    public void turnOff(boolean turnOff) {
//        if (turn == false){
//            System.out.println("Компьютер выключен");
//    }
        Random r = new Random();
        boolean vkl = r.nextBoolean();
        if (turnOff == vkl) {
            System.out.println("Компьютер включен");
            numSource--;
        } else {
            Computer.source(numSource = 0);
        }
    }

    public static void source(int numSource) {
        if (numSource == 0) {
            System.out.println("Компьютер сгорел");
        }
    }
}

