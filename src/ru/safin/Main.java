package ru.safin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String otvet;
            boolean play = true;
            while (play) {
                Help.menuProgram();
                System.out.println("Выбрать другую задачу? \"y\" - Да, \"n\" - Нет");
                otvet = sc.next();
                play = otvet.equals("y");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("Введен не ответ. Программа закрыта!");
        }
    }
}
