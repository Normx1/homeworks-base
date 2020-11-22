package HomeWork6.Task2.Shoes;

public class JeansShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Надел обувь Jeans");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Jeans");

    }
}
