package HomeWork6.Task2.Shoes;

public class HMShoes  implements Shoes{

    @Override
    public void putOn(){
        System.out.println("Надел обувь HM");
    }

    @Override
    public void takeOff(){
        System.out.println("Снял обувь НМ");
    }
}
