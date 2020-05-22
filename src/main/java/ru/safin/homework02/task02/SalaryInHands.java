/*
  Написать программу, которая считает зарплату «на руки»
  (на вход программе передается величина зарплаты, на выходе печатается зарплата за вычетом 13% (НДФЛ)
  Update: Переделать задания со второго урока так, что бы взаимодействие с
  пользователем было через стандартный поток вводы (System.in)
 */

package ru.safin.homework02.task02;

import java.util.Locale;
import java.util.Scanner;

public class SalaryInHands {
    public static void main(String[] args) {
        double wages;

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите сумму заработной платы: ");
        wages = in.nextDouble();

        System.out.println("Заработная плата \"на руки\": ");
        System.out.println(String.format("%.2f", wages - ((wages / 100 * 13))));
    }
}
