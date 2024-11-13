package com.training.mydesignpatternexamples.Creational_Patterns.FactoryPattern.WeatherFactoryExample;

import java.util.Date;

public class AccuWeather implements IWeatherProvider {

    @Override
    public int getWeather(String city, Date date) {
        return 25;  // Mesela burada AccuWeather servisine gidip veriyi alıyoruz. 25 Derece dönüyor.
    }
}
