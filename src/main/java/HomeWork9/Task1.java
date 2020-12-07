package HomeWork9;

import java.io.*;
import java.util.Arrays;

public class Task1 {

    public static boolean Polindrom(String word) {
        word = word.toLowerCase();
        int k = 0;
        String[] arr = word.split("");
        String[] arrReverse = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length - 1 - i];
        }
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
        try {
            BufferedReader bwIn = new BufferedReader(new FileReader("file.txt"));
            BufferedWriter bwOut = new BufferedWriter(new FileWriter("file_OnlyPolindroms.txt"));

            String a;
            while ((a = bwIn.readLine()) != null) {
                if (Polindrom(a) == true) {
                    bwOut.write(a);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
