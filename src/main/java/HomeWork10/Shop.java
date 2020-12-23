package HomeWork10;

import java.util.*;

public class Shop {
    public TreeSet<Product> productList;

    public Shop(TreeSet<Product> productList) {
        this.productList = productList;
    }

    public void addNewItems(Product newItem) {
        productList.add(newItem);
    }

    public TreeSet<Product> getProductList() {
        return productList;
    }

    public void setProductList(TreeSet<Product> productList) {
        this.productList = productList;
    }

    public TreeSet<Product> getAllItems() {
        return productList;
    }

    public void removeItem(Integer id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                productList.remove(p);
                System.out.println("Продукт успешно удален!");
                break;
            } else {
                System.out.println("Продукта с данным id не найдено!");
            }
        }
    }

    public void editItem(Product p) {
        for (Product a : productList) {
            if (a.getId() == p.getId()) {
                a.setPrice(p.getPrice());
                a.setName(p.getName());
                System.out.println("Продукт успешно изменен!");
            } else {
                System.out.println("Данного продукта не найдено!");
                productList.add(p);
            }
        }
    }

    public void seeAllItems(){
        for (Product a :productList) {
            System.out.printf("id: %s; Name: %s; Price: %s;",a.getId(),a.getName(),a.getPrice());
            System.out.println();
        }
    }
}