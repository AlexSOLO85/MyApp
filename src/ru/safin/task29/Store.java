package ru.safin.task29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store implements Basket {

    private final List<Product> products = new LinkedList<>();

    public static void main(String[] args) {

        Store stores = new Store();

        stores.addProduct("Вода", 10);
        stores.addProduct("Молоко", 5);
        stores.addProduct("Кофе", 7);
        stores.addProduct("Хлеб", 2);
        showStore("Добавили товары в корзину:", stores.products);

        stores.removeProduct("");
        showStore("Удалили товар из корзины:", stores.products);

        stores.updateProductQuantity("Чай", 10);
        showStore("Обновили товар в корзине:", stores.products);

        stores.getProducts();

        stores.getProductQuantity("");

        stores.clear();
        showStore("Очистили товары в корзине:", stores.products);
        System.out.println(stores.products.size());
    }

    private static void showStore(String title, List<Product> products) {
        System.out.println(title);
        for (Object product : products) {
            System.out.println(product);
        }
        System.out.println("*************************");
    }

    @Override
    public void addProduct(String product, int quantity) {
        Product prod = new Product();
        prod.setName(product);
        prod.setCount(quantity);
        products.add(prod);
    }

    @Override
    public void removeProduct(String product) {
        Product prod = new Product();
        prod.setName(product);
        products.remove(0);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        Product prod = new Product();
        prod.setName(product);
        prod.setCount(quantity);
        products.set(1, prod);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> stringList = new ArrayList<>();
        stringList.add(products.toString());
        System.out.println("Наименование товаров в корзине");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println();
        return stringList;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
