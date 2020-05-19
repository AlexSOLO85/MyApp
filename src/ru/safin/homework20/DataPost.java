package ru.safin.homework20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataPost {

    private double the_temp;
    private String applicable_date;
    private String weather_state_name;

    public void setThe_temp(double the_temp) {
        this.the_temp = the_temp;
    }

    public void setApplicable_date(String applicable_date) {
        this.applicable_date = applicable_date;
    }

    public void setWeather_state_name(String weather_state_name) {
        this.weather_state_name = weather_state_name;
    }

    public String toString(){
        return String.format("%s %s %s %.2f %s %s %s", "Дата:", applicable_date,
                "Температура:", the_temp, "градуса", "Облачность:" , weather_state_name);
    }
}
