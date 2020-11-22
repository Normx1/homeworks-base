package HomeWork6.robot.legs;

public class PhilipsLeg implements ILeg {
    private int price;

    public PhilipsLeg(int price) {
        this.price = price;
    }

    public PhilipsLeg() {
    }


    @Override
    public void step() {
        System.out.println("Нога Philips делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
