/*Игра «горячо-холодно»
Создать консольное Java-приложение «Горячо-Холодно»
1. Вначале программа «загадывает» случайное число от 1 до 100.
2. Пользователь вводит с консоли число.
3. Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
   И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
4. Для первого ввода пользователя считаем предыдущим введенным числом 0.
5. Предусмотреть возможность выхода из игры до отгадывания числа
 */
package ru.safin.task04;

import java.util.Scanner;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int comp, user, count = 0;
        do comp = rand.nextInt(100);
        while (comp == 0);
        System.out.println("Введите целое число от 1 до 100");
        System.out.println("Для выхода из программы нажмите \"-1\"");
        if (!sc.hasNextInt()) System.out.println("Ошибка! Вы ввели не целое число!");
        do {
            user = sc.nextInt();
            if (user < 1 || user > 100) {
                System.out.println("Вы ввели число не из диапазона от 1 до 100 или ввели 0");
                System.out.println("Повторите ввод");
            }
            count++;
            if (user == comp) System.out.println("Вы угадали с " + count + " попытки");
            else System.out.println(user < comp ? "Число больше" : "Число меньше");
        }
        while (user != -1);
    }
}
