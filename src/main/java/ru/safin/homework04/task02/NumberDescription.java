package ru.safin.homework04.task02;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = sc.nextInt();
        if (a != 0) {
            if (a < 0 && a % 2 == 0) {
                System.out.println("Это отрицательное четное число");
            } else if (a > 0 && a % 2 == 0) {
                System.out.println("Это положительное четное число");
            } else if (a < 0 && a % 2 != 0) {
                System.out.println("Это отрицательное нечетное число");
            } else if (a > 0 && a % 2 != 0) {
                System.out.println("Это положительное нечетное число");
            }
        } else {
            System.out.println("Нулевое значение");
        }
    }
}
