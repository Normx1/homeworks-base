package HomeWork7;

import java.util.ArrayList;

public class Sort {
    // Данный метод добавляет массив и производит сортировку на наличие совпадений, добавляет новые элементы в порядке согласно
    // количеству совпадений.
    // Прим- до начала уже должен существовать Главный ArrayList с 1м массивом внутри.
    public static void Sort(ArrayList<ArrayList> a) throws MyException {
        ArrayList<Object> arrSort = new ArrayList<>(6);
        int t = 0;
        for (int i = 0; i < a.size()-1; i++) {
            int k = 0;

//            int nom = 0;
            ArrayList arr1 = a.get(i);
            ArrayList  arr2 = a.get(i+1);
            for (int j = 0; j < arr1.size()-1; j++) {
                if (((arr1.get(j)).equals(arr2.get(j)))) {
                    k++;
                    if (k == arr1.size() ) {
                        arrSort.add(k);
//                        Сonclusion.addArr(arr1, arr2);// добавлен метод добовляющий в массив новые элементы.
                        t = -1;
                        return;
                    }
                } else {
                    arrSort.add(k);
                    break;
                }
            }
        }
        if (t != -1) {
            int maxInd = 0;
            int nom = 0;
            for (int i = 0; i < arrSort.size(); i++) {
                if ((Integer) arrSort.get(i) >= maxInd) {
                    maxInd = (Integer) arrSort.get(i);
                    nom = i;
                }
            }
            a.add(nom + 1, a.get(a.size()-1));
        }

    }

    //        System.out.println("arrsort- "+ arrSort);
//        System.out.println(maxInd);
//        System.out.println(nom);
    static class MyException extends Exception{
    }


    public static void main(String[] args) throws MyException {
        ArrayList<ArrayList> a = new ArrayList<>(10);
        ArrayList<Object> arr1 = new ArrayList<>(5);
        ArrayList<Object> arr2 = new ArrayList<>(10);
        ArrayList<Object> arr3 = new ArrayList<>(10);
        ArrayList<Object> arr4 = new ArrayList<>(10);
        ArrayList<Object> arr5 = new ArrayList<>(10);

        arr1.add("root");
        arr1.add("packeg1/");
        arr1.add("packeg2/");
        arr1.add("packeg3/");
        arr1.add("packeg4/");
        arr1.add("packeg5/");

        arr2.add("root");
        arr2.add("packeg1/");
        arr2.add("packeg3/");
        arr2.add("packeg4/");
        arr2.add("packeg5/");
        arr2.add("packeg6/");

        arr3.add("root");
        arr3.add("packeg2/");
        arr3.add("packeg3/");
        arr3.add("packeg4/");
        arr3.add("packeg5/");
        arr3.add("packeg6/");

        arr4.add("root");
        arr4.add("packeg2/");
        arr4.add("packeg3/");
        arr4.add("packeg4/");
        arr4.add("packeg5/");
        arr4.add("packeg6/");
        arr4.add("packeg7/");
        arr4.add("packeg8/");

        arr5.add("root");
        arr5.add("packeg2/");
        arr5.add("packeg3/");
        arr5.add("packeg4/");
        arr5.add("packeg5/");
        arr5.add("packeg6/");
        arr5.add("packeg7/");
        arr5.add("packeg8/");


        a.add(arr1);
        a.add(arr2);
        a.add(arr3);
        a.add(arr4);
        Sort(a);
//        Sort(a) ;
        Сonclusion.VyvodArrArr(a);

//        Sort(a );
//        Sort(a );

//        VyvodMass.VyvodArrArr(a);
        System.out.println(a);

    }
}
