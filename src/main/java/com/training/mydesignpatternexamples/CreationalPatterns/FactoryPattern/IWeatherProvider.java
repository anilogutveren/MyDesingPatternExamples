package com.training.mydesignpatternexamples.CreationalPatterns.FactoryPattern;

import java.util.Date;

public interface IWeatherProvider {

    int getWeather(String city, Date date);
}
