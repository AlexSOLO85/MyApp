/*Написать программу, которая считает зарплату «на руки»
(на вход программе передается величина зарплаты, на выходе печатается зарплата за вычетом 13% (НДФЛ)
 */
package ru.safin.task02;

public class Task02 {
    public static void main(String[] args) {
        double wages = 40000.00;
        double wages_clear = wages - ((wages / 100) * 13);
        System.out.println("Заработная плата \"на руки\" " + String.format("%.2f", wages_clear));
    }
}
