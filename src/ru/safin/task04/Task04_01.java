package ru.safin.task04;

import java.util.Random;
import java.util.Scanner;

public class Task04_01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int comp, user, count = 0;
        do comp = rand.nextInt(100);
        while (comp == 0);
        System.out.println("Введите целое число от 1 до 100");
        System.out.println("Для выхода из программы нажмите \"q\"");
        System.out.println(comp);

        if (!sc.hasNextInt()) {
            System.out.println("Выход из программы!");
        }
        else
        do {
            user = sc.nextInt();
            if (user < 1 || user > 100) {
                System.out.println("Вы ввели число не из диапазона от 1 до 100 или ввели 0");
                System.out.println("Повторите ввод");
            }
            count++;
            if (user == comp) {
                System.out.println("Вы угадали с " + count + " попытки"); break;
            } else System.out.println(user < comp ? "Число больше" : "Число меньше");
        }
        while (true);
    }
}
