package com.training.mydesignpatternexamples.Creational_Patterns.FactoryPattern;

import java.util.Date;

public class AnadoluWeather implements IWeatherProvider {

    @Override
    public int getWeather(String city, Date date) {
        return 30;  // Mesela burada AccuWeather servisine gidip veriyi alıyoruz. 30 Derece dönüyor.
    }
}
