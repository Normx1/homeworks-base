package HomeWork6.robot.hands;


public class PhilipsHand implements IHand {
    private int price;

    public PhilipsHand(int price) {
        this.price = price;
    }

    public PhilipsHand() {
    }


    @Override
    public void upHand() {
        System.out.println("Рука Philips поднимается");
    }

    @Override
    public int getPrice() {
        return price;

    }
}
