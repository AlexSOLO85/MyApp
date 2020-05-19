package ru.safin.homework20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

    private String title;
    private String location_type;
    private String latt_long;
    private String timezone;
    private String woeid;
    private List<DataPost> consolidated_weather;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public void setLatt_long(String latt_long) {
        this.latt_long = latt_long;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public void setConsolidated_weather(List<DataPost> consolidated_weather) {
        this.consolidated_weather = consolidated_weather;
    }

    public List<DataPost> getConsolidated_weather() {
        return consolidated_weather;
    }

    public String toString(){
        return "Город: " + title + "\nТип локации: " + location_type + "\nКоординаты: "
                + latt_long + "\nЧасовой пояс: " + timezone + "\nEarth ID: " + woeid + "\n";
    }
}
