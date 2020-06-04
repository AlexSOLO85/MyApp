/*
  Дан текстовый файл определенной структуры, в котором содержится информация о покупках.
  Формат файла:
  - Название товара
  - количество
  - цена
  Необходимо написать программу, которая выведет на экран чек, сформированный из этого файла. В чеке должна быть информация:
  название товара:  цена Х кол-во = стоимость
  В конце отчета вывести итоговую стоимость.
 */

package ru.safin.homework19;

import java.io.*;
import java.util.Scanner;

public class PrintCheque {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile(){

        File file = new File("src/main/resources/products.txt");
        System.out.printf("%s %11s %10s %13s\n", "Наименование", "Цена", "Кол-во", "Стоимость");
        System.out.println("==================================================");

        try {
            Scanner sc = new Scanner(file);
            double allSum = 0;
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                double quantity = Double.parseDouble(sc.nextLine());
                double price = Double.parseDouble(sc.nextLine());
                double sum = price * quantity;
                allSum += sum;
                System.out.printf("%-18s%7.2f x %7.3f =%10.2f\n", name, price, quantity, sum);
            }
            System.out.println("==================================================");
            System.out.printf("%s %43.2f", "Итого:", allSum);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
