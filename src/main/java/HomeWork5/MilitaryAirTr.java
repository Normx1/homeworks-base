package HomeWork5;

import java.util.Scanner;

public class MilitaryAirTr extends AirTransport {
    public boolean ejectionSys;
    public int numOfRockets;

    public MilitaryAirTr(int power, int maxSpeed, int weight, String model, int spamWings,
                         int length, boolean ejectionSys, int numOfRockets) {
        super(power, maxSpeed, weight, model, spamWings, length);
        this.ejectionSys = ejectionSys;
        this.numOfRockets = numOfRockets;
    }

    public void shooting(int numOfRockets ){
       while (numOfRockets > 0){
           System.out.println("Стреляем капитан? true/false");
           Scanner sc1 = new Scanner(System.in);
           Boolean decision= sc1.nextBoolean();
           if ( decision == true & numOfRockets > 0){
               numOfRockets--;
               System.out.println("Ракета пошла!\n Количество оставшихся ракет- "+ numOfRockets + "шт");
           }else if (numOfRockets == 0 ) {
               System.out.println("Боеприпасы кончились!");
           }else if(decision == false) {
               System.out.println(" Надо стрелять! ");
           }
       }
    }
    public void ejSys(boolean ejectionSys){
        if ( ejectionSys == true){
            System.out.println("Катапультирование прошло успешно!");
        }else {
            System.out.println("У Вас нет такой системы...");
        }
    }
    public void allOptions(){
        double powerKB = power*0.74;
        System.out.printf(" Мощность в л/с %s\n Мощность в Кв %s\n Максимальная скорость (км/ч) %s\n Масса (кг) %s\n Модель %s\n " +
                "Размах крыльев %s\n Минимальная длинна взлетно посадочной полосы  %s м\n " +
                "Наличие системы катапультирования %s\n Кол-во ракет на борту %s \n",   power, powerKB, maxSpeed,  weight,
                model, spamWings, length, ejectionSys, numOfRockets  );
    }
}
