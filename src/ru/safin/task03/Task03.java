/*Написать программу, которая конвертирует секунды в часы
Update: Переделать задания со второго урока так, что бы взаимодействие с
пользователем было через стандартный поток вводы (System.in)
 */
package ru.safin.task03;

import java.util.Locale;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        double second;

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите количество секунд: ");
        second = in.nextDouble();

        System.out.println("Количество часов: ");
        System.out.println(String.format("%.2f", second / 3600));
    }
}
