package HomeWork5;

public class Transport {

    public int power;
    public int maxPower;
    public int weight;
    public String model;


    public Transport(){

    }
    public Transport(int power, int maxPower,int  weight, String model){
    this.power= power;
    this.maxPower =maxPower;
    this.weight = weight;
    this.model = model;

    }
    public void viewModel(int a){
        System.out.println("model "+ a);
    }

    public static void main(String[] args) {
     }
}
