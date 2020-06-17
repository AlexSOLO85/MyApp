package ru.safin.homework04.task03;

public class MultiplicationTable {
    public static void main(String[] args){
        int a, b;
        for (a = 1; a < 11; a++){
            for (b = 1; b < 11; b++)
                System.out.printf("%4d", (a * b));
            System.out.println();
        }
    }
}
