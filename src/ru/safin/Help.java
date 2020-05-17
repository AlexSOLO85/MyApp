package ru.safin;

import ru.safin.task01.Task01;
import ru.safin.task02.Task02;
import ru.safin.task03.Task03;
import ru.safin.task04.Task04;
import ru.safin.task05.Task05;
import ru.safin.task06.Task06;
import ru.safin.task07.Task07;
import ru.safin.task08.Task08;
import ru.safin.task09.Work;
import ru.safin.task10.Machine;
import ru.safin.task11.Calc;
import ru.safin.task12.Count;
import ru.safin.task13.Task13;
import ru.safin.task14.Inference;
import ru.safin.task15.Censor;
import ru.safin.task18.Mother;
import ru.safin.task19.Task19;
import ru.safin.task20.Task20;
import ru.safin.task21.HomeLibrary;
import ru.safin.task22.Task22;
import ru.safin.task23.Task23;
import ru.safin.task25.Weather;
import ru.safin.task26.Task26;
import ru.safin.task27.Task27;
import ru.safin.task28.PersonSuperComparator;
import ru.safin.task29.Store;
import ru.safin.task30.Task30;

import java.io.IOException;
import java.util.Scanner;

public class Help {

    public static void menuProgram() throws IOException {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Введите номер задачи от 1 до 27, 0 - описание задач:");
        i = sc.nextInt();
        switch (i) {
            case 0: System.out.println(
                    "1 задача: Расчет стоимости бензина \n" +
                    "2 задача: Заработная плата на \"на руки\" \n" +
                    "3 задача: Секунды в часы \n" +
                    "4 задача: Игра \"Горячо\" \"Холодно\" \n" +
                    "5 задача: Поиск минимального из двух чисел \n" +
                    "6 задача: Описание введенного числа \n" +
                    "7 задача: Вывод на экран таблицы умножения \n" +
                    "8 задача: Арифметическая прогрессия \n" +
                    "9 задача: Пример ООП \n" +
                    "10 задача: Вендинговый аппарат и пример логгирования \n" +
                    "11 задача: Калькулятор \n" +
                    "12 задача: Счетчик количества создаваемых объектов \n" +
                    "13 задача: Статический метод конвертации \n" +
                    "14 задача: Реализация интерфейсов \n" +
                    "15 задача: Цензор \n" +
                    "16 задача: Воспитанный ребенок \n" +
                    "17 задача: Работа с файлами \n" +
                    "18 задача: Рекурсивный обход всех файлов \n" +
                    "19 задача: Домашняя библиотека \n" +
                    "20 задача: Пример кодировки файла \n" +
                    "21 задача: Кассовый чек \n" +
                    "22 задача: Пример сериализации \n" +
                    "23 задача: Сдвиг элементов массива \n" +
                    "24 задача: Реверс массива \n" +
                    "25 задача: Реализация сложного компаратора \n" +
                    "26 задача: Корзина интернет магазина \n" +
                    "27 задача: Фильтрация множества элементов \n");
            break;

            case 1: Task01.main(new String[]{});break;
            case 2: Task02.main(new String[]{});break;
            case 3: Task03.main(new String[]{});break;
            case 4: Task04.main(new String[]{});break;
            case 5: Task05.main(new String[]{});break;
            case 6: Task06.main(new String[]{});break;
            case 7: Task07.main(new String[]{});break;
            case 8: Task08.main(new String[]{});break;
            case 9: Work.main(new String[]{});break;
            case 10: Machine.main(new String[]{});break;
            case 11: Calc.main(new String[]{});break;
            case 12: Count.main(new String[]{});break;
            case 13: Task13.main(new String[]{});break;
            case 14: Inference.main(new String[]{});break;
            case 15: Censor.main(new String[]{});break;
            case 16: Mother.main(new String[]{});break;
            case 17: Task20.main(new String[]{});break;
            case 18: Task19.main(new String[]{});break;
            case 19: HomeLibrary.main(new String[]{});break;
            case 20: Task22.main(new String[]{});break;
            case 21: Task23.main(new String[]{});break;
            case 22: Weather.main(new String[]{});break;
            case 23: Task26.main(new String[]{});break;
            case 24: Task27.main(new String[]{});break;
            case 25: PersonSuperComparator.main(new String[]{});break;
            case 26: Store.main(new String[]{});break;
            case 27: Task30.main(new String[]{});break;
            default:
                throw new IllegalStateException("Нет такой задачи: " + i);
        }
    }
}