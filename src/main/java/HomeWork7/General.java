package HomeWork7;

import java.util.ArrayList;

public class General {
    public static void main(String[] args)  {
        ArrayList<ArrayList> a = new ArrayList<>(5);
        Input.Vvod(a);

//        Сonclusion.VyvodArrArr(a);
        while (true) {
        ArrayList arr = Input.Vvod(a);
       if( ArrEq.Prov1(a,arr)==true){
           Сonclusion.addArr(a, arr);
            Сonclusion.addArr(a,arr);
       }
            Сonclusion.vyvod(a);
        }
    }
}
//root/folder2/file.txt
//root/folder2/folder2/file.txt
// root/folder2/file.txt/file.txt