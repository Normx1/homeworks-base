package HomeWork6.robot.heads;

public class PhilipsHead implements IHead {
    private int price;

    public PhilipsHead(int price) {
        this.price = price;
    }

    public PhilipsHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Philips");
    }

    @Override
    public int getPrice() {
        return price;

    }
}

