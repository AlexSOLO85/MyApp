package ru.safin.other02;

import java.io.File;
import java.io.IOException;

public class Weather {

    public static void main(String... args) throws IOException {

        File dir = new File("files");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Директория " + dir.getAbsolutePath() + " создана!");
        }
        else {
            System.out.println("Директория была создана ранее!");
        }

        Converter.toJSON(new City("Москва", 20));
        City city = Converter.toJavaObject();
        System.out.println(city);
    }
}