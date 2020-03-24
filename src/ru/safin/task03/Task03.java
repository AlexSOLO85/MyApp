/*Написать программу, которая конвертирует секунды в часы
 */
package ru.safin.task03;

public class Task03 {
    public static void main(String[] args) {
        double second = 10600;
        double hour = second / 3600;
        System.out.println("Часы " + String.format("%.2f", hour));
    }
}
