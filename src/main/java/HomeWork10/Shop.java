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

    public static void addNewItemsInAplication() {
        int prov = 0;

        System.out.println("Добавить новый товар? yes/no");
        Scanner scEdit = new Scanner(System.in);
        String inputItem = scEdit.nextLine();
        // ищет товар по id;
        if (inputItem.equals("yes")) {
            while (true) {
                System.out.println("Введите id товара:");
                Scanner scEditAplication = new Scanner(System.in);
                Integer id = scEdit.nextInt();
                int i = 0;
                for (Product a : productList) {
                    if (a.getId() != id) {
                        i++;
                    }
                }
                if (i == productList.size()) {
                    String inputEditName;
                    Integer inputEditPrice;
                    while (true) {
                        System.out.println("Введите имя товара");
                        Scanner scEditName = new Scanner(System.in);
                        inputEditName = scEditName.nextLine();
                        if (!inputEditName.equals("")) {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("Введите цену товара");
                        Scanner scEditPrice = new Scanner(System.in);
                        inputEditPrice = scEditPrice.nextInt();
                        if (inputEditPrice != 0) {
                            break;
                        }
                    }
                    Product newItem = new Product(id, inputEditName, inputEditPrice);
                    productList.add(newItem);
                    System.out.println("Добавлен новый товар");
                    break;
                } else {
                    System.out.println("Продукт с данным id уже существует!");
                }
            }
        }
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

    public static void seeAllItemsArrayList(List<Product> productList) {
        for (Product a : productList) {
            System.out.printf("id: %s; Name: %s; Price: %s;", a.getId(), a.getName(), a.getPrice());
            System.out.println();
        }
    }

    public static void seeAllItemsTreeSet(TreeSet<Product> productList) {
        for (Product a : productList) {
            System.out.printf("id: %s; Name: %s; Price: %s;", a.getId(), a.getName(), a.getPrice());
            System.out.println();
        }
    }


    public static void seeAllItemsAplication(ArrayList<Product> shopList) {
        System.out.println("Вывести товар? : yes/no");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        if (input.equals("yes")) {
            System.out.println("Выберите сортировку:\n" +
                    "1- по цене(возврастание)\n" +
                    "2- по цене(убывание)\n" +
                    "3- по добавлению(от новых к старым)\n");
            Scanner scSort = new Scanner(System.in);
            int inputSort = scSort.nextInt();
            if (inputSort == 1) {
                // 1- по цене(возврастание)
                Comparator<Product> pcom1 = new PriceComporatorLowToHeight();
                TreeSet<Product> magazine = new TreeSet<>(pcom1);
                magazine.addAll(Shop.getAllItems());
                Shop.seeAllItemsTreeSet(magazine);
            } else if (inputSort == 2) {
                Comparator<Product> pcom2 = new PriceComporatorHeightToLow();
                TreeSet<Product> magazine = new TreeSet<>(pcom2);
                magazine.addAll(Shop.getAllItems());
                Shop.seeAllItemsTreeSet(magazine);
                // 2- по цене(убывание)
            } else {
                // 3-по добавлению
                List<Product> newShopAsArrayList = new ArrayList<>();
                for (int i = productList.size() - 1; i >= 0; i--) {
                    newShopAsArrayList.add(productList.get(i));
                }
                Shop.seeAllItemsArrayList(newShopAsArrayList);
            }
        }
    }


    public static void removeItemAplication() {
        System.out.println("Удалить товар? yes/no");
        Scanner scRem = new Scanner(System.in);
        String inputItem = scRem.nextLine();
        // ищет товар по id;
        if (inputItem.equals("yes")) {
            int k = 0;
            while (true) {
                System.out.println("Введите id товара:");
                Scanner scDel = new Scanner(System.in);
                Integer id = scDel.nextInt();
                int i = 0;
                for (Product p : productList) {
                    if (p.getId() == id) {
                        productList.remove(p);
                        System.out.println("Продукт успешно удален!");
                        return;
                    } else {
                        i++;
                    }
                }
                if (i == productList.size()) {
                    System.out.println("Продукта с данным id не найдено!");
                }
            }
        }
    }


    public static void editItemAplication() {

        System.out.println("Редaктировать товар? yes/no");
        Scanner scEdit = new Scanner(System.in);
        String inputItem = scEdit.nextLine();
        // ищет товар по id;
        if (inputItem.equals("yes")) {
            System.out.println("Введите id товара:");
            Scanner scEditAplication = new Scanner(System.in);
            Integer id = scEdit.nextInt();
            int i = 0;
            String inputEditName;
            while (true) {
                System.out.println("Введите новое имя товара");
                Scanner scEditName = new Scanner(System.in);
                inputEditName = scEditName.nextLine();
                if(!inputEditName.equals("")){
                    break;
                }
            }
            System.out.println("Введите новую цену товара");
            Scanner scEditPrice = new Scanner(System.in);
            Integer inputEditPrice = scEditPrice.nextInt();

            for (Product a : productList) {
                if (a.getId() == id) {
                    a.setPrice(inputEditPrice);
                    a.setName(inputEditName);
                    System.out.println("Продукт успешно изменен!");
                    break;
                } else {
                    i++;
                }
                if (i == productList.size()) {
                    System.out.println("Данного продукта не найдено!");
                }
            }
        }
    }

    public static String exit() {
        System.out.println("Exit? yes/no");
        Scanner scEditName = new Scanner(System.in);
        String input = scEditName.nextLine();
        if (input.equals("yes")) {
            return "exit";
        }
        return null;
    }

    public static void main(String[] args) {
        List<Product> shopAsArrayList = new ArrayList<>();
        new Shop(shopAsArrayList);
        Product item1 = new Product(0, "pizza", 5);
        Product item2 = new Product(1, "banana", 10);
        Product item3 = new Product(2, "bred", 2);
        Product item4 = new Product(3, "apple", 4);

        Shop.addNewItemsInArrayList(shopAsArrayList, item1);
        Shop.addNewItemsInArrayList(shopAsArrayList, item2);
        Shop.addNewItemsInArrayList(shopAsArrayList, item3);
        Shop.addNewItemsInArrayList(shopAsArrayList, item4);

//        seeAllItemsAplication((ArrayList<Product>)shopAsArrayList);
//        Shop.removeItemAplication();
        Shop.addNewItemsInAplication();
        seeAllItemsAplication((ArrayList<Product>) shopAsArrayList);
    }
}

class NameComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }


}


class PriceComporatorLowToHeight implements Comparator<Product> {
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

class PriceComporatorHeightToLow implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        }
        if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}


