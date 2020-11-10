package homework3;
import java.util.*;
public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        n = sc.nextInt();
        int pr1 = 1;
        int pr2 = 1;

        int mass[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int summ = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            if ((mass[i][j] % 2) == 0) {
                summ += mass[i][j];
            }
        }
//        System.out.println("Сумма главной диагонали- " + summ);
//        System.out.println("Нечетные элем под гл. диагональю(вкл): ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if ((mass[i][j] % 2) == 1) {
//                    System.out.print(mass[i][j] + " ");
//                }
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < n; i++) {
//            int j = i;
//            pr1 = mass[i][j]*pr1;
//                }
//        for (int i= 0; i < n; i++){
//                int j= n-i-1;
//                pr2 = mass[i][j] * pr2;
//        }
//        System.out.println(pr1);
//        System.out.println(pr2);
//        if (pr1 > pr2){
//            System.out.println("Произведение 1-й диагонали - больше");
//        }
//        if (pr1 < pr2){
//            System.out.println("Произведение 2-й диагонали - больше");
//        }
//        if (pr1== pr2){
//            System.out.println(" Произведения диагоналей - равны");
//        }
        System.out.println("Четные элем над поб. диагональю(не вкл): ");
        for (int i = 0; i <n; i++) {
            for (int j = n-i-1; j>=0; j--)
            if (n-i!=j+1 & (mass[i][j] % 2) == 0) {
                System.out.print(mass[i][j] + " ");
           }
        }
    }
}