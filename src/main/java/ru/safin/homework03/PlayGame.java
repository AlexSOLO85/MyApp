package ru.safin.homework03;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String otvet;
        boolean play = true;
        while (play) {
            Game.myGame();
            System.out.println("Хотите повторить? \"y\" - Да, \"n\" - Нет");
            otvet = sc.next();
            if (otvet.equals("y")) play = true;
            else play = false;
        }
    }
}