package ru.safin;

import ru.safin.task01.Task01;
import ru.safin.task02.Task02;
import ru.safin.task03.Task03;
import ru.safin.task04.Task04;
import ru.safin.task05.Task05;
import ru.safin.task06.Task06;
import ru.safin.task07.Task07;
import ru.safin.task08.Task08;

import java.util.Scanner;

public class Help {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Введите номер задачи от 1 до 8, 0 - описание задач:");
        i = sc.nextInt();
        switch (i) {
            case 0: System.out.println("1 задача: Расчет стоимости бензина \n" +
                    "2 задача: Заработная плата на \"на руки\" \n" +
                    "3 задача: Секунды в часы \n" +
                    "4 задача: Игра \"Горячо\" \"Холодно\" \n" +
                    "5 задача: Поиск минимального из двух чисел \n" +
                    "6 задача: Описание введенного числа \n" +
                    "7 задача: Вывод на экран таблицы умножения \n" +
                    "8 задача: Арифметическая прогрессия");break;
            case 1: Task01.main(new String[]{});break;
            case 2: Task02.main(new String[]{});break;
            case 3: Task03.main(new String[]{});break;
            case 4: Task04.main(new String[]{});break;
            case 5: Task05.main(new String[]{});break;
            case 6: Task06.main(new String[]{});break;
            case 7: Task07.main(new String[]{});break;
            case 8: Task08.main(new String[]{});break;
        }
    }
}