package HomeWork6.Task2.Shoes;

public class HMShoes  implements Shoes{

    @Override
    public void putOn(){
        System.out.println("Надеть обувь HM");
    }

    @Override
    public void takeOff(){
        System.out.println("Снять обувь НМ");
    }
}
