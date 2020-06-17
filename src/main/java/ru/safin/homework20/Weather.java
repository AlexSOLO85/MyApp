package ru.safin.homework20;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Weather {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("Прогноз погоды\n");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        URL jsonURL =  new URL("https://www.metaweather.com/api/location/2122265/");
        try {
            Post usrPost = mapper.readValue(jsonURL, Post.class);
            System.out.println(usrPost);
            for (DataPost post : usrPost.getConsolidated_weather())
                System.out.println(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
