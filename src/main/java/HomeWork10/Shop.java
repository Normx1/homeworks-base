package HomeWork10;

import java.util.*;

public class Shop {
    public Map productList;

    public Shop(Map productList) {
        this.productList = productList;
    }

    public static Map<Integer, Product> shop(Comparator a) {
        Comparator<Product> comp1 = new NameCorporator();
        Map<Integer, Product> shopList = new TreeMap(comp1);
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
}

class NameCorporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class PriceComporator implements Comparator<Product> {
    @Override
    public int compare(Map.Entry<Integer,Product>) {
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

