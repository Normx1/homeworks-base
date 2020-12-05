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
        while (true) {
            for (int i = 0; i < arr1.size() ; i++) {
                if (truth != false) {
                    truth = VyvodMass.PointSearch(arr1.get(i));
                } else {
                    System.out.println("Запрещено создавать в файле каталоги и другие файлы!");
                    return a;
                    // можно попробовать здесь вызвать ошибку
                }
            }


            a.add(arr1);
//            VyvodMass.VyvodArrArr(a);
            break;
        }return arr1;
    }

}
