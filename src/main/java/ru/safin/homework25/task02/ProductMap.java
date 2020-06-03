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

public class ProductMap {
    public static void main(String[] args) {
        StoreMap storeMap = new StoreMap();
        storeMap.addProduct("Вода", 10);
        storeMap.addProduct("Молоко", 5);
        storeMap.addProduct("Кофе", 7);
        storeMap.addProduct("Хлеб", 2);
        System.out.println("Добавили товары в корзину");
        storeMap.getProducts();

        System.out.println("Удалили товар из корзины");
        storeMap.removeProduct("Вода");
        storeMap.getProducts();

        System.out.println("Обновили товары в корзине");
        storeMap.updateProductQuantity("Кофе", 10);
        storeMap.getProducts();

        System.out.println("Количество выбранного продукта в корзине");
        storeMap.getProductQuantity("Хлеб");

        storeMap.clear();
    }
}
