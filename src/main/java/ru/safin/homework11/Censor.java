package ru.safin.homework11;

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