package HomeWork6.Task2.Man;

import HomeWork6.Task2.Jacket.Jacket;
import HomeWork6.Task2.Shoes.Shoes;
import HomeWork6.Task2.Shorts.Shorts;

public class Man implements IMan {
    private Jacket jacket;
    private Shorts shorts;
    private Shoes shoes;

    public Man(Jacket jacket, Shorts shorts, Shoes shoes) {
        this.jacket = jacket;
        this.shorts = shorts;
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        shorts.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        shorts.takeOff();
        shoes.takeOff();
    }
}
