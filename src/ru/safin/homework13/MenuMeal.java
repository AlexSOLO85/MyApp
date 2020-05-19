package ru.safin.homework13;

public class MenuMeal {

    public static void menu() {
        for (Meal m : Meal.values()) {
            System.out.println(m.getNum() + ". " + m.getName());
        }
    }
}
