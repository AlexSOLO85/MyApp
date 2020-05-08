/**
 * Дан двумерный массив. Задача – написать метод
 * public void toLeft() {}
 * 1.Пройти с 1-ой до последней строки
 * 2.Пройти с 1-го до предпоследнего элемента
 * 3.В текущую ячейку поместить значение следующей
 * 4.Последнему элементу присвоить 0
 */

package ru.safin.task26;

public class Task26 {
    public static void toLeft(int[][] array) {

        System.out.println("Пройти с 1-ой до последней строки:");
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               System.out.printf("%d\t", array[i][j]);
           }
           System.out.println();
        }

        System.out.println();

        System.out.println("Пройти с 1-го до предпоследнего элемента:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("В текущую ячейку поместить значение следующей и последнему элементу присвоить 0:");
        int length = array[0].length;
        for (int j = 0; j < array.length; j++) {
            System.arraycopy(array[j], 1, array[j], 0, length - 1);
            array[j][length - 1] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t" , array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        toLeft(array);
    }
}
