package HomeWork4;

import java.util.Random;
import java.util.Scanner;

class Computer {

    private String CPU;
    private String RAM;
    private String HDD;
    private int source;
    static int numSource = 0;
    int burnUp=0;
    private

    Computer(String CPU, String RAM, String HDD, int source ) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.source = source;
    }
    public void dyspalayInfo() {
        System.out.printf("Processor: %s \n RAM: %s\n Hard Drive %s\n Resource: %d\n ", CPU , RAM, HDD, source);
    }

    public static void main(String[] args) {
        Computer Comp = new Computer("Ryzen 3", "Kingston", "HITACHI 1000GB", 6 );
        Comp.dyspalayInfo();
        Comp.turnOn(true);
        Comp.turnOff(true);
        Comp.source(numSource);

    }
    public void turnOn( boolean turn) {
//        if (turn == false){
//            System.out.println("Компьютер выключен");
//    }
        Random r = new Random();
        boolean vkl = r.nextBoolean();
        if (turn == vkl) {
            System.out.println("Компьютер выключен");
            numSource--;
        } else {
            burnUp = 0;
            System.out.println("Компьютер сгорел");
        }
    }
    public void turnOff( boolean turnOff) {
//        if (turn == false){
//            System.out.println("Компьютер выключен");
//    }
        Random r = new Random();
        boolean vkl = r.nextBoolean();
        if(turnOff== vkl){
            System.out.println("Компьютер выключен");
            numSource--;
        }else {
            burnUp = 0;
            System.out.println("Компьютер сгорел");

        }
    }
    public void source(int numSource){
        if( numSource == 0){
            System.out.println("Компьютер сгорел");
        }
    }


//    public static void main(String[] args) {
//        Scanner pr = new Scanner(System.in);
//        String proc = pr.nextLine();
//        Scanner r = new Scanner(System.in);
//        String ram = pr.nextLine();
//        Scanner h = new Scanner(System.in);
//        String hard = pr.nextLine();
//        Scanner res = new Scanner(System.in);
//        int resource = pr.nextInt();
//
//        dyspalayInfo(proc,ram,hard,resource);
//
//
////        Vkl();
////        Close();
////        resurses(resource);
//    }
//        // Метод описания
//    public



//        }
//
//    static void Vkl() {
//            int rand = 0;
//            int vvod = 0;
//            String vkl;
//            System.out.println("Включить компьютер Yes/No?");
//            Scanner vklsc = new Scanner(System.in);
//            vkl = vklsc.nextLine();
//            if (vkl == "Yes") {
//                System.out.println("Упс- сбой... Необходимо ввести число 1 или 0, чтобы спасти комп!");
//                Random r = new Random();
//                Scanner sc = new Scanner(System.in);
//                rand = r.nextInt(2);
//                vvod = sc.nextInt();
//                if (rand == vvod) {
//                    System.out.println("Угадал! Компьютер всего-то выключился!");
//                } else {
//                    System.out.println("Не угадал, компьютер- сгорел");
//                }
//            } else {
//                System.out.println("Компьютер выключен");
//            }
//        }
//
//    static void Close() {
//            int rand = 0;
//            int vvod = 0;
//            String off;
//            System.out.println("Выключить компьютер Yes/No?");
//            Scanner vklsc = new Scanner(System.in);
//            off = vklsc.nextLine();
//            if (off == "Yes") {
//                System.out.println("Упс- сбой... Необходимо ввести число 1 или 0, чтобы спасти комп!");
//                Random r = new Random();
//                Scanner sc = new Scanner(System.in);
//                rand = r.nextInt(2);
//                vvod = sc.nextInt();
//                if (rand == vvod) {
//                    System.out.println("Угадал! Компьютер всего-то выключился!");
//                } else {
//                    System.out.println("Не угадал, компьютер- сгорел");
//                }
//            } else {
//                System.out.println("Компьютер продолжает работать");
//            }
//        }
//
//    static void resurses(int res) {
//        System.out.println("Сколько раз вы собираетесь вкл /выкл комп?");
//        Scanner sc = new Scanner(System.in);
//        int kol= sc.nextInt();
//        if (kol<= res){
//            System.out.println("Компьютер сгорает...");
//        }
//    }
}

