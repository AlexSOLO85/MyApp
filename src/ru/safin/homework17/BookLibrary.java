package ru.safin.homework17;

import java.io.*;
import java.util.*;

public class BookLibrary {

    private static List<Book> bookList = new ArrayList<>();
    private static final String fileName = "files/BookLibrary.txt";
    private static final String dirName = "files";

    public static void helpMenu() {

        try {
            System.out.println("Домашняя библиотека");
            System.out.println("1: Просмотреть библиотеку\n2: Добавить книгу в библиотеку\n3: Заполнить библиотеку классиков?");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1: System.out.println("Книги в библиотеке:");
                    showBook();
                    break;
                case 2:
                    addBook();
                    saveBook();
                    break;
                case 3:
                    addBookClassic();
                    break;
            }
        } catch (Exception ex) {
            System.err.println("Нет такого пункта меню!");
        }
    }

    private static void showBook() throws IOException {

        try {
            File f = new File(fileName);
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

    private static void addBook() {

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
            bookList = new ArrayList<>();
            bookList.add(new Book(name, author, year));
            System.out.println("Книга добавлена в библиотеку!");
        } catch (Exception ex) {
            System.err.println("Неверно введен год издания. Введите год в числовом виде. Книга не добавлена в библиотеку");
        }
    }

    private static void saveBook() {

        try {
            File dir = new File(dirName);
            if (!dir.exists()) {
                if (dir.mkdir()) {
                    System.out.println("Директория создана");
                }
                else {
                    System.out.println("Директорию создать не удалось");
                }
            }

            File f = new File(fileName);
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Book book : bookList)
                bw.write("Название: " + book.getName()  + " Год: " + book.getYear() + " Автор: " + book.getAuthor() + "\n");
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void addBookClassic() {

        bookList.add(new Book("Мертвые души" , "Николай Гоголь", 1842));
        bookList.add(new Book("Хождение по мукам", "Алексей Толстой", 1941));
        bookList.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1940));
        bookList.add(new Book("Война и мир", "Лев Толстой", 1868));

        saveBook();

        System.out.println("В библиотеку добавлена классика");
    }
}