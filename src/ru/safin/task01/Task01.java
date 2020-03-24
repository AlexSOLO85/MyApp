/*Написать программу, которая считает стоимость бензина
(на вход программе передается кол-во литров, на выходе печатается стоимость)
 */
package ru.safin.task01;

public class Task01 {
    public static void main(String[] args) {
        double price = 43.55;
        double count = 50.00;
        double total = price * count;
        System.out.println("Стоимость бензина " + String.format("%.2f", total));
    }
}
