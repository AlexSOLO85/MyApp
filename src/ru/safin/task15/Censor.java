/**
 * Напишите программу которая получает на вход некую строку , после она вызывает метод,
 * заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой» и выводит результат в консоль!
 */

package ru.safin.task15;

import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение или слово");
        name = sc.nextLine();
        String nameCensor = name.replaceAll("бяка", "*вырезано цензурой*");
        System.out.println(nameCensor);
    }
}