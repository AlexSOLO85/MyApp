/*
  Написать программу "воспитанный ребенок".
  Программа должна имитировать поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой.
  Если еда не нравится, ребенок ее не ест: выбрасывается исключительная ситуация, которая обрабатывается «мамой».
  Воспитанный ребенок, даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.
  Создать перечисление «Еда» с несколькими вариантами еды: морковь, яблоко, каша и т.д.
  Создать класс «ребенок» с методом «кушать», принимающий на вход некоторую еду. В методе происходит сравнение поступившей
  еды с вкусовыми предпочтениями и в случае если они не совпадают, выбрасывается исключение.
  «Одобренная» ребенком еда съедается: возвращается сообщение «съел … за обе щеки».
  Вне зависимости съел ребенок еду или выплюнул, ребенок благодарит маму, печатая в консоль «спасибо, мама».
  Создать главный класс и метод main - это будет «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения ребенка.
*/

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
