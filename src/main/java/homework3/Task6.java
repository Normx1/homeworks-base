package homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int n = 3;
        int k = 0;
        String mass[][] = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = " ";
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println();

        while (k<=9) {
            System.out.println();
            System.out.println("Ход '+' :");
            System.out.println("Введите координаты Х");
            int x = sc1.nextInt();
            System.out.println("Введите координаты Y");
            int y = sc2.nextInt();
            x = x - 1;
            y = y - 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == y & j == x) {
                        if (mass[i][j] == "0") {
                            return;
                        } else {
                            mass[i][j] = "+";
                        }
                    }
                    System.out.print(mass[i][j]);
                }
                System.out.println();
            }
            k = k + 1;
            System.out.println("Ход 'o' :");
            System.out.println("Введите координаты Х");
            int x1 = sc1.nextInt();
            System.out.println("Введите координаты Y");
            int y1 = sc2.nextInt();
            x1 = x1 - 1;
            y1 = y1 - 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == y1 & j == x1 & mass[i][j] != "+") {
                        mass[i][j] = "0";
                    }
                    System.out.print(mass[i][j]);
                }
                System.out.println();
            }
            k = k + 1;
        }
//            while (true){
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if () {
//                        System.out.println("+ - победил");
//                    }
//                    if (mass[0][j] == "+" || mass[1][j] == "+" || mass[2][j] == "+") {
//                        System.out.println("+ - победил");
//                    }
//                    if (i == j & mass[i][j] == "+") {
//                        System.out.println("+ - победил");
//                    }
//                    if (n - i == j & mass[i][j] == "+") {
//                        System.out.println("+ - победил");
                    }
                }
//            }
//        }
//    }
//}