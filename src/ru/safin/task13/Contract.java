package ru.safin.task13;

public class Contract {
    private final int number;
    private final String date;
    private String[] name;

    public Contract() {
        date = "10.01.2020";
        number = 40;
        name = new String[]{"Товар №1", "Товар №2", "Товар №3"};
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getName() {
        return name;
    }
}