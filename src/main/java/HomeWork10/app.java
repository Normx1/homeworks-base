package HomeWork10;

import java.util.*;

public class app {

    public static void main(String[] args) {
        Comparator<Product> pcom = new PriceComporator();
        TreeSet<Product> magazine = new TreeSet<>(pcom);
        Shop wallMart = new Shop(magazine);
//        wallMart.setProductList(magazine);
        Product item1 = new Product(0, "pizza", 5);
        Product item2 = new Product(1, "banana", 10);
        Product item3 = new Product(2, "bred", 2);
        Product item4 = new Product(3, "apple", 4);
        Product item5 = new Product(4, "pear", 8);
        Product item6 = new Product(2, "milk", 5);


        // Метод добавления
        wallMart.addNewItems(item1);
        wallMart.addNewItems(item2);
        wallMart.addNewItems(item3);
        wallMart.addNewItems(item4);
        wallMart.addNewItems(item5);
        wallMart.addNewItems(item6);

        wallMart.seeAllItems();
        wallMart.removeItem(3);


        wallMart.editItem(item6);
        wallMart.seeAllItems();

        wallMart.getAllItems();






    }

    static class NameComporator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }

    }

    static class PriceComporator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}