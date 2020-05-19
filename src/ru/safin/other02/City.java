package ru.safin.other02;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

    @JsonProperty
    private String city;
    @JsonProperty
    private double temperature;

    public City(){}

    public City(String city, double temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Город: " + city + ", Температура: " + temperature;
    }
}
