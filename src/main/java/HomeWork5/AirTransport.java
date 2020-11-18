package HomeWork5;

public class AirTransport extends Transport {
    public int spamWings;
    public int length;

    public AirTransport(int power, int maxSpeed, int weight, String model, int spamWings, int length) {
        super(power, maxSpeed, weight, model);
        this.spamWings = spamWings;
        this.length = length;
    }
}

