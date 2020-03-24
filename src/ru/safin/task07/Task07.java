/*Написать программу для вывода на экран таблицы умножения
 */
package ru.safin.task07;

public class Task07 {
    public static void main(String[] args){
        int a, b;
        for (a = 1; a < 11; a++){
            for (b = 1; b < 11; b++)
                System.out.printf("%4d", (a * b));
            System.out.println();
        }
    }
}
