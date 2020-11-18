package HomeWork5;

import java.util.Scanner;

public class MilitaryAirTr {
    public boolean ejectionSys;
    public int numOfRockets;

    public MilitaryAirTr(boolean ejectionSys, int numOfRockets) {
        this.ejectionSys = ejectionSys;
        this.numOfRockets = numOfRockets;

    }
    public void shooting(int numOfRockets ){
       while (numOfRockets > 0){
           System.out.println("Стреляем капитан?");
           Scanner sc1 = new Scanner(System.in);
           Boolean decision= sc1.nextBoolean();
           if ( decision == true & numOfRockets>0){
               numOfRockets--;
               System.out.println("Ракета пошла!\n Количество оставшихся ракет- "+ numOfRockets + "шт");
           }else if (numOfRockets==0) {
               System.out.println("Боеприпасы кончились!");
           }else if(decision==false) {
               System.out.println(" Надо стрелять! ");
           }
       }
    }
    public void ejSys(boolean ejectionSys){
        if ( ejectionSys== true){
            System.out.println("Катапультирование прошло успешно!");
        }else {
            System.out.println("У Вас нет такой системы...");
        }
    }
}
