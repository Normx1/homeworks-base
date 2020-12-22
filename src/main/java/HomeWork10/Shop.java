package HomeWork10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    public Map productList;

    public Shop(Map productList) {
        this.productList = productList;
    }

    public static Map<Integer, Product> shop() {
        Map<Integer, Product> shopList = new HashMap<>();
        return shopList;
    }

    public static void addProduct(Map shopList, Product newProduct) {
        try {
            shopList.putIfAbsent(newProduct.getId(), newProduct);
        } catch (IllegalArgumentException e) {
            System.out.println("Товар с таким id уже существует!");
        }
    }

    public static void removeProduct(Map shopList, Integer id) {
        if (shopList.containsKey(id)) {
            shopList.remove(id);
            System.out.println("Удаление прошло успешно!");
        } else {
            System.out.println("Товара с данным id не существует");
        }
    }

    public static Map addAllItems(Map shoplist) {
        return (Map) shoplist.values();
    }

    public static void showShopList(Map<Integer, Product> shopList) {
        for (Map.Entry<Integer, Product> newEntry : shopList.entrySet()) {
            System.out.printf("id: %s; Name: %s; Price: %s$;", newEntry.getValue().getId(), newEntry.getValue().getName(),
                    newEntry.getValue().getPrice());
            System.out.println();

        }
    }

    public static void editProduct(Map<Integer, Product> shopList) {
        int i = 0;
        while (i != 1) {
            try {
                System.out.println("Введите id товара: ");
                Scanner sc1 = new Scanner(System.in);
                Integer idProduct = sc1.nextInt();
                Product editedProduct = shopList.get(idProduct);
                System.out.printf("id: %s; Name: %s; Price: %s$;", editedProduct.getId(), editedProduct.getName(),
                        editedProduct.getPrice());
                System.out.println();
                System.out.println("Введите новый id");
                Scanner sc2 = new Scanner(System.in);
                Integer newIdProduct = sc2.nextInt();
                editedProduct.setId(newIdProduct);


                System.out.println("Введите новое имя:");
                Scanner sc3 = new Scanner(System.in);
                String newName = sc3.nextLine();
                editedProduct.setName(newName);

                System.out.println("Введите новую цену:");
                Scanner sc4 = new Scanner(System.in);
                Integer newPrice = sc4.nextInt();
                editedProduct.setPrice(newPrice);
            } catch (NullPointerException e) {
                System.out.println("Данного id не существует!");
                continue;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Map magazine = shop();
        Product item1 = new Product(0, "apple", 5);
        Product item2 = new Product(1, "banana", 10);
        Product item3 = new Product(3, "pear", 40);
        Product item4 = new Product(5, "milk", 15);


        addProduct(magazine, item1);
        addProduct(magazine, item2);
        addProduct(magazine, item3);
        addProduct(magazine, item4);

        showShopList(magazine);
        removeProduct(magazine, 3);
        showShopList(magazine);

        editProduct(magazine);
        showShopList(magazine);

    }
}
