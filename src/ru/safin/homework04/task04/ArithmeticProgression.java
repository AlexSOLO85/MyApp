/*
  Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел
 */

package ru.safin.homework04.task04;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите первое число последовательности:");
        a = sc.nextInt();
        System.out.println("Введите разность прогресии:");
        b = sc.nextInt();
        System.out.println("Введите число окончания прогрессии:");
        c = sc.nextInt();

        for (int i = a; i < c; i += b) {
            System.out.print(i + "\t");
        }
    }
}
