/*Написать программу для поиска минимального из двух чисел
 */
package ru.safin.task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int a, b;
        /* Первый выриант решения */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = sc.nextInt();
        System.out.println("Введите второе число: ");
        b = sc.nextInt();
        System.out.println("Минимальное число из двух: " + Math.min(a, b));

        /*Второй вариант решения */
        if (a < b)
            System.out.println("Минимальное число из двух: " + a);
        if (a > b)
            System.out.println("Минимальное число из двух: " + b);
        if (a == b)
            System.out.println("Числа " + a + " и " + b + " равны");
    }
}
