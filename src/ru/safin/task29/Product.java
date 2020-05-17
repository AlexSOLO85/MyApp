package ru.safin.task29;

public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setCount(int count) {
        this.count = count;
        return count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Продукт: " + getName() + "\t | Количество: " + getCount();
    }
}
