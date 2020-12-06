package HomeWork7;

import java.util.ArrayList;


public class Sort {

    // Данный метод добавляет массив и производит сортировку на наличие совпадений, добавляет новые элементы в порядке согласно
    // количеству совпадений.
    // Прим- до начала уже должен существовать Главный ArrayList с 1м массивом внутри.
    public static void Sort(ArrayList<ArrayList> mainArr, ArrayList arr2) {
        ArrayList<Object> arrSort = new ArrayList<>(6);
        int t = 0;
        for (int i = 0; i < mainArr.size(); i++) {
            int numEquals = 0;

            ArrayList arr1 = mainArr.get(i);
            for (int j = 0; j < arr1.size(); j++) {
                if (((arr1.get(j))==(arr2.get(j)))) {
                    numEquals++;
                    if (numEquals == arr1.size()) {
                        arrSort.add(numEquals);
                        Сonclusion.addArrBig(arr1, arr2);// добавлен метод добавляющий в массив новые элементы если они равны и второй больше первого.
                        t = -1;
                    }
                } else {
                    arrSort.add(numEquals);
                    break;
                }
            }
        }
        if (t != -1) {
            int maxInd = 0;
            int nomArr2InMainArr = 0;
            for (int i = 0; i < arrSort.size(); i++) {
                if ((Integer) arrSort.get(i) >= maxInd) {
                    maxInd = (Integer) arrSort.get(i);
                    nomArr2InMainArr = i;
                }
            }
            mainArr.add(nomArr2InMainArr + 1, arr2);
        }

    }

}
