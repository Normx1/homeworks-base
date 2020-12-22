package HomeWork10;

import java.util.HashMap;
import java.util.Map;

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
        if (shopList.containsKey(id) == true) {
            shopList.remove(id);
            System.out.println("Удаление прошло успешно!");
        } else {
            System.out.println("Товара с данным id не существует");
        }
    }

    public static Map addAllItems(Map shoplist) {
        return (Map) shoplist.values();
    }

    public static void showShopList(Map<Integer,Product> shopList) {
        for (Map.Entry<Integer,Product>  entry : shopList.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
    }

    public static void main(String[] args) {
        Map magazine = shop();
        Product item1 = new Product(0,"apple", 50);
        addProduct(magazine, item1);
        showShopList(magazine);
     }
}
