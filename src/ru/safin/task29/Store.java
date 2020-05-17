/**
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
 * interface Basket {
 *     void addProduct(String product, int quantity);
 *     void removeProduct(String product);
 *     void updateProductQuantity(String product, int quantity);
 *     void clear();
 *     List<String> getProducts();
 *     int getProductQuantity(String product);
 * }
 */

package ru.safin.task29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store implements Basket {

    private final List<Product> products = new LinkedList<>();
    private final String string = "******************************";

    public static void main(String[] args) {

        Store stores = new Store();

        stores.addProduct("Вода", 10);
        stores.addProduct("Молоко", 5);
        stores.addProduct("Кофе", 7);
        stores.addProduct("Хлеб", 2);
        showStore("Добавили товары в корзину:", stores.products);

        stores.removeProduct("Хлеб");
        showStore("Удалили товар из корзины:", stores.products);

        stores.updateProductQuantity("Кофе", 10);
        showStore("Обновили товар в корзине:", stores.products);

        stores.getProducts();

        stores.getProductQuantity(String.valueOf(stores.products));

        stores.clear();
        System.out.println(stores.products.isEmpty());
    }

    private static void showStore(String title, List<Product> products) {
        System.out.println(title);
        for (Object product : products) {
            System.out.println(product);
        }
        System.out.println("******************************");
    }

    @Override
    public void addProduct(String product, int quantity) {
        Product prod = new Product(product, quantity);
        products.add(prod);
    }

    @Override
    public void removeProduct(String product) {
        for (Product p : products) {
            if (p.getName().equals(product)) {
                products.remove(p);
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int index;
        for (Product p : products) {
            if (p.getName().equals(product)) {
                index = products.indexOf(p);
                products.set(index, new Product(product, quantity));
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Корзина очищена");
    }

    @Override
    public List<String> getProducts() {
        List<String> stringList = new ArrayList<>();
        stringList.add(products.toString());
        System.out.println("Наименование товаров в корзине:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println(string);
        return stringList;
    }

    @Override
    public int getProductQuantity(String product) {
        List<String> list = new ArrayList<>();
        list.add(products.toString());
        System.out.println("Количество товаров в корзине:");
        int sum = 0;
        for (Product prod : products) {
            sum += prod.getCount();
            System.out.println(prod.getCount());
        }
        System.out.println(string);
        System.out.println("Сумма товаров в корзине: " + sum);
        System.out.println(string);
        return sum;
    }
}
