package HomeWork5;

public class Passenger extends LandTransport {
    public String typeBody;
    public int numOfPass;

    public Passenger(String typeBody, int numOfPass){
        super(4,5);
        this.typeBody = typeBody;
        this.numOfPass = numOfPass;
    }


    public static void main(String[] args){
//        Transport transport = new Transport(12,20,5000,"bmw");
        Passenger Car = new Passenger("crouiser",50);
        System.out.printf("%s\n%s\n%s\n%s\n", Car.power, Car.numOfWeels, Car.model, Car.typeBody);
    }
}
