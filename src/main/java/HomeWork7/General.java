package HomeWork7;

import java.util.ArrayList;
import java.util.Scanner;

public class General {
    //    public static void main(String[] args)  {
//        ArrayList<ArrayList> a = new ArrayList<>(5);
//        Input.Vvod(a);
//
////        Сonclusion.VyvodArrArr(a);
//        while (true) {
//        ArrayList arr = Input.Vvod(a);
//       if( ArrEq.Prov1(a,arr)==true){
//           Сonclusion.addArr(a, arr);
//            Сonclusion.addArr(a,arr);
//       }
//            Сonclusion.vyvod(a);
//        }
//    }
//}
//root/folder2/file.txt
//root/folder2/folder2/file.txt
// root/folder2/file.txt/file.txt
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
