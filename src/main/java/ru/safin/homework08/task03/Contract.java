package ru.safin.homework08.task03;

public class Contract {
    int number;
    String date;
    String[] name;

    public Contract(int number, String date, String name) {
        this.number = number;
        this.date = date;
        this.name = new String[]{"Товар 1", "Товар 2", "Товар 3"};
    }
}