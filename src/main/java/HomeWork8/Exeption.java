package HomeWork8;



public class Exeption {
    public static void Exeption(int a) throws MyExeption {
        if (a % 2 == 0) {
            throw new MyExeption(a);
        }
    }
}
