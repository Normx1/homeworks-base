package HomeWork7;

import java.util.ArrayList;

public class Сonclusion {
    public static void VyvodArrArr(ArrayList a) {
        vyvod((ArrayList) a.get(0));
        for (int i = 0; i < a.size(); i++) {
            vyvodBezPovt((ArrayList) a.get(0), (ArrayList) a.get(i));
        }
    }


    public static void vyvodBezPovt(ArrayList arr1, ArrayList arr2) {
        for (int i = 0; i < arr1.size(); i++) {
            int numEquals = 0;
            if (!arr1.get(i).equals(arr2.get(i))) {
                for (int j = i; j < arr2.size(); j++) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("\t");
                    }
                    System.out.println(arr2.get(j));
                }
                return;
            } else {
                numEquals++;
//            }
//            if (numEquals == arr1.size()) {
//                addArr(arr1, arr2);
            }
        }
//        System.out.println();
    }

    public static void vyvod(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
            for (int j = 0; j <= i; j++) {
                System.out.print("\t");
            }
        }
        System.out.println();
    }

    // Если массивы совпадают,  то к массиву добавляется новые элементы.
    public static void addArr(ArrayList<ArrayList> a, ArrayList arr2) {
        for (int l = 0; l < a.size(); l++) {
            ArrayList arr1 = a.get(l);
            int k = 0;
            for (int i = 0; i < arr1.size(); i++) {
                if (((arr1.get(i)).equals(arr2.get(i)))) {
                    k++;
                    if (k == arr1.size() - 1) {
                        if (arr2.size() > arr1.size()) {
                            for (int j = arr1.size(); j < arr2.size(); j++) {
                                arr1.add(arr2.get(j));
                            }
//        } else if ((arr2.size() == arr1.size())) {
//            System.out.println("Такое значение уже есть");

                        }
                    }
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
