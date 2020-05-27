package ru.safin.homework27;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Ряд Фибоначчи");
        System.out.println("Введите способ вывода на консоль:\n" +
                "1. Итерационный\n" +
                "2. Рекурсивный");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Введите количество итераций");
                int numOne = sc.nextInt();
                iterationFibonacci(numOne); break;
            case 2:
                System.out.println("Введите количество итераций\n" +
                        "Внимание! При большом количестве итераций вывод ряда может замедлиться!");
                int numTwo = sc.nextInt();
                print(numTwo); break;
            default:
                throw new IllegalStateException("Введено не числовое значение: " + i);
        }
    }

    private static void print(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("{" + recursionFibonacci(i) + "} ");
        }
    }

    private static void iterationFibonacci(int num) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < num; i++) {
            System.out.print("{" + firstNumber + "} ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        System.out.println();
    }

    private static int recursionFibonacci(int num) {
        if ((num == 1) || (num == 0)) {
            return num;
        }
        return recursionFibonacci(num - 1) + recursionFibonacci(num - 2);
    }
}
