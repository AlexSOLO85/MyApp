/*
  Написать программу, которая считает стоимость бензина
  (на вход программе передается кол-во литров, на выходе печатается стоимость)
  Update: Переделать задания со второго урока так, что бы взаимодействие с
  пользователем было через стандартный поток вводы (System.in)
 */

package ru.safin.homework02.task01;

import java.util.Locale;
import java.util.Scanner;

public class CostOfGasoline {
    public static void main(String[] args) {
        double price;
        double count;

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите стоимость бензина: ");
        price = in.nextDouble();

        System.out.println("Введите количестов литров: ");
        count = in.nextDouble();

        System.out.println("Общая стоимость: ");
        System.out.println(String.format("%.2f", price * count));
    }
}
