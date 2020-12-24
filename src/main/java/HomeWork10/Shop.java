package HomeWork10;

import java.util.*;

public class Shop {
    public static List<Product> productList;

    public Shop(List<Product> productList) {
        this.productList = productList;
    }

    public void addNewItems(Product newItem) {
        productList.add(newItem);
    }

    public static void addNewItemsInArrayList(List<Product> arr1, Product newItem) {
        arr1.add(newItem);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public static List<Product> getAllItems() {
        return productList;
    }

    public static void removeItem(Integer id) {
        int i = 0;
        for (Product p : productList) {
            if (p.getId() == id) {
                productList.remove(p);
                System.out.println("Продукт успешно удален!");
                break;
            } else {
                i++;
            }
        }
        if (i == productList.size()) {
            System.out.println("Продукта с данным id не найдено!");

        }
    }

    public static void editItem(Product p) {
        int i = 0;
        for (Product a : productList) {
            if (a.getId() == p.getId()) {
                a.setPrice(p.getPrice());
                a.setName(p.getName());
                System.out.println("Продукт успешно изменен!");
                break;
            } else {
                i++;
            }
            if (i == productList.size()) {
                System.out.println("Данного продукта не найдено!");
                productList.add(p);
            }
        }
    }

        public static void seeAllItemsArrayList (List<Product> productList) {
            for (Product a : productList) {
                System.out.printf("id: %s; Name: %s; Price: %s;", a.getId(), a.getName(), a.getPrice());
                System.out.println();
            }
        }

    public static void seeAllItemsTreeSet (TreeSet<Product> productList) {
        for (Product a : productList) {
            System.out.printf("id: %s; Name: %s; Price: %s;", a.getId(), a.getName(), a.getPrice());
            System.out.println();
        }
    }
    }