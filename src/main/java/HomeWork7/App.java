package HomeWork7;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<ArrayList> mainArr = new ArrayList<>(10);
        ArrayList arr1 = Input.Vvod((ArrayList) mainArr);
        mainArr.add(arr1);
        while (true) {
            try {
                arr1 = Input.Vvod((ArrayList) mainArr);
            } catch (NullPointerException e) {
                System.out.println("Запрещено создавать в файле каталоги и другие файлы!");

            } catch (ArithmeticException e) {
            }
            Sort.Sort(mainArr, arr1);
        }
    }
}
