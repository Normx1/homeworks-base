package HomeWork7;

import java.util.ArrayList;

public class Сonclusion {
    public static void Сonclusion(ArrayList <ArrayList> a) {
        vyvod(a.get(0));
        for (int i = 0; i < a.size()-1; i++) {
            Сonclusion.vyvodBezPovt(a.get(i), a.get(i+1));
        }
    }


    public static void vyvodBezPovt(ArrayList arr1, ArrayList arr2) {
        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2.get(i))) {
                for (int j = i; j < arr2.size(); j++) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("\t");
                    }
                    System.out.println(arr2.get(j));
                }
                return;
            }
        }
    }
//используется при первом выводе массива
    public static void vyvod(ArrayList a) {
        int  k = a.size();
        for (int i = 0; i < a.size() ; i++) {
            System.out.println(a.get(i));
            if (k > 0) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("\t");
                    k--;
                }
            }
        }
    }


    //Поиск точки и определение является ли строка файлом.
    public static boolean PointSearch(String a) {
        int index = a.indexOf('.');
        if (index == -1) {
//            System.out.println("Можно добавлять" + index);
            return true;
        } else {
//            System.out.println("Низя");
            return false;
        }
    }

    // Если массивы совпадают,  то к массиву добавляется новые элементы.
    public static void addArrBig(ArrayList arr1, ArrayList arr2) {
        if (arr2.size() > arr1.size()) {
            for (int i = arr1.size(); i < arr2.size(); i++) {
                arr1.add(arr2.get(i));
            }
        }
    }
}
