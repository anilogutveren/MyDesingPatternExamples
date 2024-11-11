package com.training.mydesignpatternexamples.CreationalPatterns.FactoryPattern;

import java.util.Date;

public class AccuWeather implements IWeatherProvider {

    @Override
    public int getWeather(String city, Date date) {
        return 25;  // Mesela burada AccuWeather servisine gidip veriyi alıyoruz. 25 Derece dönüyor.
    }
}
