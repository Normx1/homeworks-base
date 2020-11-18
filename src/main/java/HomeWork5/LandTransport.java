package HomeWork5;

public class LandTransport extends Transport {
    public int numOfWeels;
    public int fuelCons;

    public LandTransport(int power, int maxSpeed, int weight, String model, int numOfWeels, int fuelCons) {
        super(power, maxSpeed, weight, model);
        this.numOfWeels = numOfWeels;
        this.fuelCons = fuelCons;
    }
}
