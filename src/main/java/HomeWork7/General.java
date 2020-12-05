package HomeWork7;

import java.util.ArrayList;

public class General {
    public static void main(String[] args) throws Sort.MyException {
        ArrayList<ArrayList> a = new ArrayList<>();
        Input.Vvod(a);
        Сonclusion.VyvodArrArr(a);
        while (true) {
            Sort.Sort(a,Input.Vvod(a));
            Сonclusion.VyvodArrArr(a);
        }
    }
}

