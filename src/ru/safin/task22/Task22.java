/*
Написать программу, которая копирует файл с одной кодировкой в файл с другой.
 */

package ru.safin.task22;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class Task22 {

    private static void copyFiles(){

        String string = "Пример текста в кодировке!";
        Charset iso88591 = StandardCharsets.ISO_8859_1;
        Charset utf8 = StandardCharsets.UTF_8;

        try {
            Files.createDirectories(Paths.get("files/"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File newFile = new File("files/newFile.txt");
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(string);
            bw.close();

            File copiedFile = new File("files/copiedFile.txt");

            FileReader reader = new FileReader(newFile, iso88591);
            FileWriter writer = new FileWriter(copiedFile, utf8);

            reader.transferTo(writer);
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        copyFiles();
    }
}
