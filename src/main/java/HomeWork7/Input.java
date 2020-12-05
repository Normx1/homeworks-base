package HomeWork7;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static ArrayList<String> Vvod(ArrayList a) {
        ArrayList<String> arr1 = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        String per = sc1.nextLine();
        String[] arr = per.split("/");
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i] + "/");
        }
        Boolean truth = true;

        for (int i = 0; i < arr1.size(); i++) {
            if (truth != false) {
                truth = Сonclusion.PointSearch(arr1.get(i));
            } else {
                System.out.println("Запрещено создавать в файле каталоги и другие файлы!");
                MyException.myExc();
            }
        }
        return arr1;
    }
    public static ArrayList<String> Vvod( ) {
        ArrayList<String> arr1 = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        String per = sc1.nextLine();
        String[] arr = per.split("/");
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i] + "/");
        }
        return arr1;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList> a = new ArrayList<>();

        while (true) {
            try {
                a.add(Vvod(a));
                Сonclusion.VyvodArrArr(a);

            } catch (NullPointerException e) {
                System.out.println("Запрещено создавать в файле каталоги и другие файлы!");
             }
        }
    }
}
