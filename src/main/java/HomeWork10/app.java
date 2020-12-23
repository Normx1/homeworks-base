package HomeWork10;

import java.util.*;

public class app {

    public static void main(String[] args) {
        List<Product> shopAsArrayList = new ArrayList<>();
        Product item1 = new Product(0, "pizza", 5);
        Product item2 = new Product(1, "banana", 10);
        Product item3 = new Product(2, "bred", 2);
        Product item4 = new Product(3, "apple", 4);
        Product item5 = new Product(4, "pear", 8);
        Product item6 = new Product(2, "milk", 5);


        // Метод добавления
        Shop.addNewItemsInArrayList(shopAsArrayList, item1);
        Shop.addNewItemsInArrayList(shopAsArrayList, item2);
        Shop.addNewItemsInArrayList(shopAsArrayList, item3);
        Shop.addNewItemsInArrayList(shopAsArrayList, item4);
        Shop.addNewItemsInArrayList(shopAsArrayList, item5);


        Comparator<Product> pcom = new PriceComporator();
        TreeSet<Product> magazine = new TreeSet<>(pcom);
        magazine.addAll(shopAsArrayList);
        Shop wallMart = new Shop(magazine);


        wallMart.seeAllItems();
        wallMart.removeItem(3);


        wallMart.editItem(item6);
        wallMart.seeAllItems();

        List<Product> newShopAsArrayList = new ArrayList<>();
        for (int i = shopAsArrayList.size()-1; i > 0; i--) {
            newShopAsArrayList.add(shopAsArrayList.get(i));
        }
        for (Product a : newShopAsArrayList) {
            System.out.printf("id: %s; Name: %s; Price: %s;", a.getId(), a.getName(), a.getPrice());
            System.out.println();
        }
    }
}

  class NameComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

  class PriceComporator implements Comparator<Product> {
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
