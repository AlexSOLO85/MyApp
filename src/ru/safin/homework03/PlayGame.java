/*
  Игра «горячо-холодно»
  Создать консольное Java-приложение «Горячо-Холодно»
  1. Вначале программа «загадывает» случайное число от 1 до 100.
  2. Пользователь вводит с консоли число.
  3. Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
  и позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
  4. Для первого ввода пользователя считаем предыдущим введенным числом 0.
  5. Предусмотреть возможность выхода из игры до отгадывания числа
 */

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