package ru.safin.homework21.task02;

public class ReverseArray {
    public static void main(String[] args) {
        myMassive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void myMassive(int[] array) {

        System.out.println("Вывод массива:");
        for (int value : array) {
            System.out.printf("%d\t", value);
        }

        System.out.println();

        System.out.println("Вывод массива в обратном порядке:");
        int length = array.length;
        int tmp;
        for (int i = 0; i < length/2; i++) {
            tmp = array[length - i - 1];
            array[length - i - 1] = array[i];
            array[i] = tmp;
        }
        for (int value : array) {
            System.out.printf("%d\t", value);
        }
    }
}
