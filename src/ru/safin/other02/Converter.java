package ru.safin.other02;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class Converter {

    private final static String baseFile = "files/weather.json";

    public static void toJSON(City city) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), city);
        System.out.println("Файл json создан!");
    }

    public static City toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), City.class);
    }
}
