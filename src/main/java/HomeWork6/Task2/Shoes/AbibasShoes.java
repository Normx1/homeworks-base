package HomeWork6.Task2.Shoes;

public class AbibasShoes implements Shoes {

    @Override
     public void putOn(){
        System.out.println("Надел обувь Abibas");
    }

    @Override
    public  void takeOff(){
        System.out.println("Снял обувь Abibas");
    }
}
