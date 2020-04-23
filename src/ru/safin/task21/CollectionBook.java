package ru.safin.task21;

import java.io.*;
import java.util.*;

public class CollectionBook {

    static List<Books> booksList = new ArrayList<>();

    public static void collection() {

        try {
            System.out.println("Домашняя библиотека");
            System.out.println("1: Просмотреть библиотеку\n2: Добавить книгу в библиотеку\n3: Заполнить библиотеку классиков?");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1: System.out.println("Книги в библиотеке:");
                    showCollection();
                    break;
                case 2:
                    addCollection();
                    saveCollection();
                    break;
                case 3:
                    addCollectionClassic();
                    break;
            }
        } catch (Exception ex) {
            System.err.println("Нет такого пункта меню!");
        }
    }

    public static void showCollection() throws IOException {

        try {
            File f = new File("files/collection.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Библиотека не найдена. Добавьте книги в библиотеку");
        }
    }

    public static void addCollection() {

        try {
            Scanner sc = new Scanner(System.in);
            String name;
            String author;
            int year;
            System.out.println("Введите название книги: ");
            name = sc.nextLine();
            System.out.println("Введите автора книги: ");
            author = sc.nextLine();
            System.out.println("Введите год издания: ");
            year = sc.nextInt();
            booksList = Collections.singletonList(new Books(name, author, year));
            System.out.println("Книга добавлена в библиотеку!");
        } catch (Exception ex) {
            System.err.println("Неверно введен год издания. Введите год в числовом виде. Книга не добавлена в библиотеку");
        }
    }

    public static void saveCollection() {

        try {
            File dir = new File("files");
            if (!dir.exists()) {
                if (dir.mkdir()) {
                    System.out.println("Директория создана");
                }
                else {
                    System.out.println("Директорию создать не удалось");
                }
            }

            File f = new File("files/collection.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Books book : booksList)
                bw.write("Название: " + book.getName()  + " Год: " + book.getYear() + " Автор: " + book.getAuthor() + "\n");
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void addCollectionClassic() {

        booksList.add(new Books("Мертвые души" , "Николай Гоголь", 1842));
        booksList.add(new Books("Хождение по мукам", "Алексей Толстой", 1941));
        booksList.add(new Books("Мастер и Маргарита", "Михаил Булгаков", 1940));
        booksList.add(new Books("Война и мир", "Лев Толстой", 1868));

        saveCollection();

        System.out.println("В библиотеку добавлена классика");
    }
}