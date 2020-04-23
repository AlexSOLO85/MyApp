package ru.safin.task21;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String e;
            boolean p = true;
            while (p) {
                CollectionBook.collection();
                System.out.println("Вернуться к исходному выбору? \"y\" - Да, \"n\" - Нет");
                e = sc.next();
                p = e.equalsIgnoreCase("y");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("Введен не ответ. Программа закрыта!");
        }
    }
}
