package HomeWork10;

import com.sun.source.tree.Tree;

import java.util.*;

import static HomeWork10.Shop.*;

public class app {

    public static void main(String[] args) {
        Comparator<Product> comp = new PriceComporator();
        Map magazine = shop(comp);
        Product item1 = new Product(0, "pizza", 5);
        Product item2 = new Product(1, "banana", 10);
        Product item3 = new Product(2, "bred", 2);
        Product item4 = new Product(3, "apple", 4);
        Product item5 = new Product(4, "pear", 8);
        Product item6 = new Product(5, "milk", 5);

        addProduct(magazine, item1);
        addProduct(magazine, item2);
        addProduct(magazine, item3);
        addProduct(magazine, item4);
        addProduct(magazine, item5);
        addProduct(magazine, item6);
        showShopList(magazine);

        removeProduct(magazine, 3);

        showShopList(magazine);
    }
}