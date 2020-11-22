package HomeWork6.Task2.Jacket;

public class JeansJacket implements Jacket {

    @Override
    public void putOn(){
        System.out.println("Надел куртку Jeans");
    }

    @Override
    public  void takeOff(){
        System.out.println("Снял куртку Jeans");
    }
}
