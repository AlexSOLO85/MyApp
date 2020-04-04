package ru.safin.task10;

public enum Product {
    TEA(40, "Чай"),
    COFFEE(50, "Кофе");

    private int price;
    private String name;

    Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
