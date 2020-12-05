package HomeWork7;

import java.util.ArrayList;

public class ArrEq {
// проверка на наличие
    public static Boolean Prov1(ArrayList a, ArrayList a3) {
        int k = 0;
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(a3)) {
//                System.out.println("Не равны");
                k++;
            } else {
//                System.out.println("Равны");
            }
        }
        if (k == a.size()) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList> a = new ArrayList<>(10);
        ArrayList<String> a1 = new ArrayList<>(10);
        ArrayList<String> a2 = new ArrayList<>(10);
        ArrayList<String> a3 = new ArrayList<>(10);


        a1 = (Input.Vvod());
        a2 = (Input.Vvod());
        a3 = (Input.Vvod());
        a.add(a1);
        a.add(a2);

        //        a.add(a3);
        Prov1(a, a3);
        Сonclusion.addArr(a, a3);
        System.out.println(a);
    }
}
//root/folder1/file.txt
//root/folder2/file.txt
//root/folder3/file.txt
//root/folder2/retun/file.txt
//root/folder2/retun/file.txt
// root/folder2/retun/return2/ file.txt