/*
  Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
  interface Basket {
      void addProduct(String product, int quantity);
      void removeProduct(String product);
      void updateProductQuantity(String product, int quantity);
      void clear();
      List<String> getProducts();
      int getProductQuantity(String product);
  }
 */

package ru.safin.homework25.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StoreMap implements ImplBasketMap {

    private static final Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        for (Iterator<String> it = products.keySet().iterator(); it.hasNext();)
            if (product.equals(it.next()))
                it.remove();
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int oldQuantity = 0;
        for (Map.Entry<String, Integer> map : products.entrySet()) {
            if (product.equals(map.getKey()))
                oldQuantity = products.get(product);
            products.replace(product, oldQuantity, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Корзина очищена");
        System.out.println(products.isEmpty());
    }

    @Override
    public List<String> getProducts() {
        for (Map.Entry<String, Integer> map : products.entrySet()) {
            System.out.println("Продукт: " + map.getKey() + "\t | Количество: " + map.getValue());
        }
        System.out.println("******************************");
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Map.Entry<String, Integer> map : products.entrySet()) {
            if (product.equals(map.getKey())) {
                System.out.println("Продукт: " + map.getKey() + "\t | Количество: " + map.getValue());
            }
        }
        System.out.println("******************************");
        return 0;
    }
}
