package ru.safin.task17;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово!");
        String s = sc.nextLine();
        String s1 = s.replaceAll("бяка" , "*вырезано цензурой*");
        System.out.println(s1);
    }
}
