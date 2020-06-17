package ru.safin.homework13;

import java.util.Scanner;

public class Mother {
    public static void main(String[] args) {
        Child child = new Child();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите продукт");
        MenuMeal.menu();
        int i = sc.nextInt();
        if (i == 1) {
            child.eat(Meal.CARROT);
        } else if (i == 2) {
            child.eat(Meal.APPLE);
        } else if (i == 3) {
            child.eat(Meal.PORRIDGE);
        } else if (i == 4) {
            child.eat(Meal.JUICE);
        } else {
            throw new IllegalStateException("Нет такого продукта в меню!");
        }
    }
}
