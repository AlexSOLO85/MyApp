package ru.safin.homework30;

import java.util.Scanner;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        System.out.println("Введите слово:");
        Scanner sc = new Scanner(System.in.toString());
        String string = sc.nextLine();
        System.out.print("Первый неповторяющийся символ: " + "\"" + getFirstChar(string) + "\"");
    }

    private static String getFirstChar(String string) {
        String res = "Нет неповторяющегося символа!";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (string.indexOf(currentChar) == string.lastIndexOf(currentChar)) {
                res = Character.toString(currentChar);
                break;
            }
        }
        return res;
    }
}
