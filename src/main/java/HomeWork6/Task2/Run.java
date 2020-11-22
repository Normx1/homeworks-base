package HomeWork6.Task2;

import HomeWork6.Task2.Jacket.HMJacket;
import HomeWork6.Task2.Man.Man;
import HomeWork6.Task2.Shoes.JeansShoes;
import HomeWork6.Task2.Shorts.AbibasShorts;

public class Run {

    public static void main(String[] args) {

        Man m1 = new Man(new HMJacket(), new AbibasShorts(), new JeansShoes());
        m1.putOn();
        m1.takeOff();
    }
}