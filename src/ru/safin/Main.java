package ru.safin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String otvet;
        boolean play = true;
        while (play) {
            Help.main(new String[]{});
            System.out.println("Выбрать другую задачу? \"y\" - Да, \"n\" - Нет");
            otvet = sc.next();
            if (otvet.equals("y")) play = true;
            else play = false;
        }
    }
}
