package HomeWork7;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static ArrayList<String> Vvod(ArrayList mainArr) {
        ArrayList<String> arr1 = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        String per = sc1.nextLine();
        if (per.equals("print")) {
            Сonclusion.Сonclusion(mainArr);
            throw  new ArithmeticException();//для вывода всего пути
        } else if (per.equals("")) {//против пустой строки
            System.out.println("Вы ввели пустую строку");
            throw  new ArithmeticException();
        } else {
            String[] arr = per.split("/");
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    arr1.add(arr[i] + "/");
                } else {
                    arr1.add(arr[i]);
                }
            }
            Boolean truth = true;

            for (int i = 0; i < arr1.size(); i++) {
                if (truth != false) {
                    truth = Сonclusion.PointSearch(arr1.get(i));
                } else {
                    throw  new NullPointerException();
                }
            }

        }
        return arr1;
    }

    public static ArrayList<String> Vvod() {
        ArrayList<String> arr1 = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        String per = sc1.nextLine();
        String[] arr = per.split("/");
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i] + "/");
        }
        return arr1;
    }

}
