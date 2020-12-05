package HomeWork7;

import java.util.ArrayList;

public class General {
    public static void main(String[] args)  {
        ArrayList<ArrayList> a = new ArrayList<>();
        Input.Vvod(a);
//        Сonclusion.VyvodArrArr(a);
        while (true) {
            Sort.Sort(a,Input.Vvod(a));
            Сonclusion.VyvodArrArr(a);
        }
    }
}
//root/folder2/file.txt
//root/folder2/folder2/file.txt
// root/folder2/file.txt/file.txt