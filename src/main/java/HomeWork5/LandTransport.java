package HomeWork5;

public class LandTransport extends Transport {
    public int numOfWeels;
    public int fuelCons;
    public LandTransport( int numOfWeels, int fuelCons){
        super();
        this.numOfWeels = numOfWeels;
        this.fuelCons = fuelCons;
    }

//    public LandTransport(int numOfWeels, int fuelCons) {
//        this.numOfWeels = numOfWeels;
//        this.fuelCons = fuelCons;
//    }

    public void dispalayInfo(){
        System.out.printf("Мощность: %s\nМаксимальная мощность: %s\nЧисло колес: %s\n ",power, maxPower, numOfWeels);
    }
    public static void main(String[] args){
//        Transport transport = new Transport(12,20,5000,"bmw");
        LandTransport Car = new LandTransport(4,50);
        Car.dispalayInfo();
    }
}
