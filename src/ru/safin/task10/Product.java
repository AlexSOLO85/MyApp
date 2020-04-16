package ru.safin.task10;

public enum Product {
    TEA(1,40, "Чай"),
    COFFEE(2,50, "Кофе");

    private int number;
    private int price;
    private String name;

    Product(int number, int price, String name) {
        this.number = number;
        this.price = price;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
