package ru.safin.homework15.task02;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class RecursiveTraversal {

    static String counter = " ";

    public static void main(String[] args) {
        System.out.println("Введите путь к папке: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Нет такой папки");
        }
        else  {
            printAllFiles(dir);
        }
    }

    static void printAllFiles(File dir) {
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            print(file);
            if (file.isDirectory()) {
                counter += " ";
                printAllFiles(file);
            }
        }
        counter = " ";
    }

    static void print(File file) {
        System.out.println(counter + File.separator + file.getAbsolutePath());
    }
}
