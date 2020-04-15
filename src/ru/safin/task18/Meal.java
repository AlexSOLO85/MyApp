package ru.safin.task18;

public enum Meal {

    CARROT (1 , "Морковь"),
    APPLE (2 , "Яблоко"),
    PORRIDGE (3 , "Каша"),
    JUICE (4 , "Сок");

    private int num;
    private String name;

    Meal(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return this.name;
    }
}
