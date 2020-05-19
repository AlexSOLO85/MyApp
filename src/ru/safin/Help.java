package ru.safin;

import ru.safin.homework02.task01.CostOfGasoline;
import ru.safin.homework02.task02.SalaryInHands;
import ru.safin.homework02.task03.SecondsPerHour;
import ru.safin.homework03.PlayGame;
import ru.safin.homework04.task01.MinOfTwoNumbers;
import ru.safin.homework04.task02.NumberDescription;
import ru.safin.homework04.task03.MultiplicationTable;
import ru.safin.homework04.task04.ArithmeticProgression;
import ru.safin.homework06.ShowAnimal;
import ru.safin.homework07.VendingMachine;
import ru.safin.homework08.task01.Calculator;
import ru.safin.homework08.task02.PrintCount;
import ru.safin.homework08.task03.ContractToAct;
import ru.safin.homework09.ShowHuman;
import ru.safin.homework11.Censor;
import ru.safin.homework13.Mother;
import ru.safin.homework15.task01.OperationsOnFile;
import ru.safin.homework15.task02.RecursiveTraversal;
import ru.safin.homework17.HomeLibrary;
import ru.safin.homework18.FileEncoding;
import ru.safin.homework19.PrintCheque;
import ru.safin.homework20.Weather;
import ru.safin.homework21.task01.TwoDimensionalArray;
import ru.safin.homework21.task02.ReverseArray;
import ru.safin.homework22.PersonSuperComparator;
import ru.safin.homework23.Store;
import ru.safin.homework24.FilterSet;

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

            case 1: CostOfGasoline.main(new String[]{});break;
            case 2: SalaryInHands.main(new String[]{});break;
            case 3: SecondsPerHour.main(new String[]{});break;
            case 4: PlayGame.main(new String[]{});break;
            case 5: MinOfTwoNumbers.main(new String[]{});break;
            case 6: NumberDescription.main(new String[]{});break;
            case 7: MultiplicationTable.main(new String[]{});break;
            case 8: ArithmeticProgression.main(new String[]{});break;
            case 9: ShowAnimal.main(new String[]{});break;
            case 10: VendingMachine.main(new String[]{});break;
            case 11: Calculator.main(new String[]{});break;
            case 12: PrintCount.main(new String[]{});break;
            case 13: ContractToAct.main(new String[]{});break;
            case 14: ShowHuman.main(new String[]{});break;
            case 15: Censor.main(new String[]{});break;
            case 16: Mother.main(new String[]{});break;
            case 17: OperationsOnFile.main(new String[]{});break;
            case 18: RecursiveTraversal.main(new String[]{});break;
            case 19: HomeLibrary.main(new String[]{});break;
            case 20: FileEncoding.main(new String[]{});break;
            case 21: PrintCheque.main(new String[]{});break;
            case 22: Weather.main(new String[]{});break;
            case 23: TwoDimensionalArray.main(new String[]{});break;
            case 24: ReverseArray.main(new String[]{});break;
            case 25: PersonSuperComparator.main(new String[]{});break;
            case 26: Store.main(new String[]{});break;
            case 27: FilterSet.main(new String[]{});break;
            default:
                throw new IllegalStateException("Нет такой задачи: " + i);
        }
    }
}