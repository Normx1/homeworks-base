package HomeWork6.robot;

import HomeWork6.robot.hands.PhilipsHand;
import HomeWork6.robot.hands.SamsungHand;
import HomeWork6.robot.hands.SonyHand;
import HomeWork6.robot.heads.SamsungHead;
import HomeWork6.robot.heads.SonyHead;
import HomeWork6.robot.legs.PhilipsLeg;
import HomeWork6.robot.legs.SamsungLeg;
import HomeWork6.robot.legs.SonyLeg;

public class Run {


    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        PhilipsHand R1hand = new PhilipsHand(15);
        SonyHead R1head = new SonyHead(20);
        SamsungLeg R1Leg = new SamsungLeg(22);
        IRobot R1 = new Robot(R1head, R1hand, R1Leg);

        R1.action();
        System.out.println("Цена робота R1- " + R1.getPrice());

        IRobot R2 = new Robot(new SonyHead(20), new SamsungHand(6), new SonyLeg(52));
        R2.action();
        System.out.println("Цена робота R2- " + R2.getPrice());


        Robot R3 = new Robot(new SamsungHead(11), new SonyHand(16), new PhilipsLeg(17));
        R3.action();
        System.out.println("Цена робота R3- " + R3.getPrice());

        if (R1.getPrice() >= R2.getPrice() & R2.getPrice() > R3.getPrice()) {
            System.out.println("Самый дорогой робот- R1 ");
        } else if (R1.getPrice() < R2.getPrice() & R2.getPrice() > R3.getPrice()) {
            System.out.println("Самый дорогой робот- R2 ");
        } else {
            System.out.println("Самый дорогой робот - R3");
        }
    }
}
