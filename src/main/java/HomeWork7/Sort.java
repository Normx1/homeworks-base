package HomeWork7;

import java.util.ArrayList;


public class Sort {
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
        }
        return true;
    }
    // Данный метод добавляет массив и производит сортировку на наличие совпадений, добавляет новые элементы в порядке согласно
    // количеству совпадений.
    // Прим- до начала уже должен существовать Главный ArrayList с 1м массивом внутри.
    public static void Sort(ArrayList<ArrayList> a, ArrayList arr2)   {
        ArrayList<Object> arrSort = new ArrayList<>(6);
        ArrayList<ArrayList> aNew = new ArrayList<>();
        int t = 0;
        for (int i = 0; i < a.size(); i++) {
            int k = 0;

            ArrayList arr1 = a.get(i);
             for (int j = 0; j < arr1.size(); j++) {
                if (((arr1.get(j)).equals(arr2.get(j)))) {
                    k++;
                    if (k == arr1.size() ) {
                        arrSort.add(k);
                        Сonclusion.addArrBig(arr1, arr2);// добавлен метод добовляющий в массив новые элементы.
                        t = -1;
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
            a.add(nom + 1, arr2);
        }

    }

//            System.out.println("arrsort- "+ arrSort);
//        System.out.println(maxInd);
//        System.out.println(nom);
//    static class MyException extends Exception{
//    }


    public static void main(String[] args) {
            ArrayList<ArrayList> a = new ArrayList<>(10);
//        ArrayList<Object> arr1 = new ArrayList<>(5);
//        ArrayList<Object> arr2 = new ArrayList<>(10);
//        ArrayList<Object> arr3 = new ArrayList<>(10);
//        ArrayList<Object> arr4 = new ArrayList<>(10);
//        ArrayList<Object> arr5 = new ArrayList<>(10);
//        ArrayList<Object> arr6 = new ArrayList<>(10);


        ArrayList arr1 = Input.Vvod((ArrayList) a);
        ArrayList arr2 = Input.Vvod((ArrayList) a);
//        ArrayList arr3 = Input.Vvod((ArrayList) a);
//        ArrayList arr4 = Input.Vvod((ArrayList) a);
//        ArrayList arr5 = Input.Vvod((ArrayList) a);
//        ArrayList arr6 = Input.Vvod((ArrayList) a);

//        arr1.add("root");
//        arr1.add("packeg1/");
//        arr1.add("packeg2/");
//        arr1.add("packeg3/");
//        arr1.add("packeg4/");
//        arr1.add("packeg5/");

//        arr2.add("root");
//        arr2.add("packeg1/");
//        arr2.add("packeg3/");
//        arr2.add("packeg4/");
//        arr2.add("packeg5/");
//        arr2.add("packeg6/");
//
//        arr3.add("root");
//        arr3.add("packeg2/");
//        arr3.add("packeg3/");
//        arr3.add("packeg4/");
//        arr3.add("packeg5/");
//        arr3.add("packeg4/");
//
//        arr4.add("root");
//        arr4.add("packeg2/");
//        arr4.add("packeg3/");
//        arr4.add("packeg4/");
//        arr4.add("packeg5/");
//        arr4.add("packeg6/");
////        arr4.add("packeg7/");
////        arr4.add("packeg8/");
//
//        arr5.add("root");
//        arr5.add("packeg2/");
//        arr5.add("packeg3/");
//        arr5.add("packeg4/");
//        arr5.add("packeg5/");
//        arr5.add("packeg6/");
//        arr5.add("packeg7/");
//        arr5.add("packeg8/");
//
//        arr6.add("root");
//        arr6.add("packeg2/");
//        arr6.add("packeg3/");
//        arr6.add("packeg4/");
//        arr6.add("packeg5/");
//        arr6.add("packeg6/");
//        arr6.add("packeg7/");
//        arr6.add("packeg8/");


        a.add(arr1);
        Sort(a,arr2);
//         Sort(a,arr3);
//         Sort(a,arr4);
//         Sort(a,arr6);
//         Sort(a,arr5);
//        Sort(a) ;
        Сonclusion.vyvod(arr1);
        for (int i = 0; i < a.size()-1; i++) {
            Сonclusion.vyvodBezPovt(a.get(i), a.get(i+1));
        }

        System.out.println(a);

//        Sort(a );
//        Sort(a );

//        System.out.println(a);

    }


}
