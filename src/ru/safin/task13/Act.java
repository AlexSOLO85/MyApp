package ru.safin.task13;

public class Act {
    private int number;
    private String date;
    public String[] name;

    public Act() {
        date = String.valueOf(0);
        number = 0;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    public String setDate(String date) {
        this.date = date;
        return date;
    }

    public String[] setArray(String... massive) {
        name = massive;
        return massive;
    }
}

