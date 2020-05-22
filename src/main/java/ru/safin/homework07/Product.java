package ru.safin.homework07;

public enum Product {
    TEA(1,40, "Чай"),
    COFFEE(2,50, "Кофе"),
    WATER(3, 10, "Вода"),
    JUICE(4, 60, "Сок");

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
