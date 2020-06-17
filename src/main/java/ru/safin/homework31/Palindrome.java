package ru.safin.homework31;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Проверка на палиндром: \"true\" - палиндром, \"false\" - не палиндром");
        System.out.println("Введите слово для проверки:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("%s %s\n", "1. Перемещение с обоих концов строки одновременно:", palindromeStr(str));
        System.out.printf("%s %s\n", "2. Используя стандартные функции строки:", palindromeStd(str));
    }

    private static boolean palindromeStr(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean palindromeStd(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(text);
    }
}
