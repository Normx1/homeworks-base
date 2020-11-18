package HomeWork5;

public class LandTransport extends Transport {
    public int numOfWeels;
    public int fuelCons;


    public LandTransport(int numOfWeels, int fuelCons, int power) {
        this.numOfWeels = numOfWeels;
        this.fuelCons = fuelCons;
    }

    public static void main(String[] args){
        Transport transport = new Transport(12,20,5000,"bmw");
    }


}
