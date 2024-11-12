package com.training.mydesignpatternexamples.Creational_Patterns.FactoryPattern;

import java.util.Date;

public interface IWeatherProvider {

    int getWeather(String city, Date date);
}
