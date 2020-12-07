package HomeWork9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {

    public boolean Polindrom(String word) {
        word = word.toLowerCase();
        int k = 0;
        String[] arr = word.split("");
        String[] arrReverse = new String[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrReverse));
        for (int i = 0; i < arr.length; i++) {
            if (arrReverse[i].equals(arr[i])) {
                k++;
            }
        }
        if (k == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;
        try {
            fileIn = new FileReader("file.txt");
            fileOut = new FileWriter("file_OnlyPolindroms");

            int a = 0;

            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
