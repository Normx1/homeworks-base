package HomeWork10;

import HomeWork6.Task2.Man.IMan;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        System.out.println("Вывести товар? : yes/no");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        if (input == "yes") {
            System.out.println("Выберите сортировку:" +
                    "1- по цене(возврастание) " +
                    "2- по цене(убывание)" +
                    "3- по добавлению(от новых к старым)");
            Scanner scSort = new Scanner(System.in);
            Integer inputSort = scSort.nextInt();
            if (inputSort == 1) {
                // 1- по цене(возврастание)
            }
            if (inputSort == 2) {
                // 2- по цене(убывание)
            } else {
                // по добавлению
            }
        }


        System.out.println("Добавить товар?");
        Scanner scAddNewItem = new Scanner(System.in);
        String inputNewItem = scAddNewItem.nextLine();
        if (inputNewItem == "yes") {
            System.out.println("Введите id нового товара");
            // id ввод нового товара;
            System.out.println("Введите имя нового товара");
            // name нового товара
            System.out.println("Введите цену нового товара");
            //price нового товара


        } else {
            //continue;
        }

        System.out.println("Удалить товар?");
        if (inputNewItem == "yes") {
            System.out.println("Введите id товара");
            Scanner scDel = new Scanner(System.in);
            Integer inputRemove = scDel.nextInt();
            // удаления товара по id;
        } else {
            //continue;
        }

        System.out.println("Редоктировать товар?");
        if (inputNewItem == "yes") {
            System.out.println("Введите id товара");
            Scanner scDel = new Scanner(System.in);
            Integer inputRemove = scDel.nextInt();
            // ищет товар по id;

            System.out.println("Введите новое имя товара");
            Scanner scEditName = new Scanner(System.in);
            String inputEditName = scEditName.nextLine();
//Присвоение нового имени

            System.out.println("Введите новую цену товара");
            Scanner scEditPrice = new Scanner(System.in);
            Integer inputEditPrice = scEditPrice.nextInt();
//Присвоение новой цены

// Метод выход
        }
    }
}