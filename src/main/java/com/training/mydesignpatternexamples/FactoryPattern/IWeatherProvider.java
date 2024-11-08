package com.training.mydesignpatternexamples.FactoryPattern;

import java.util.Date;

public interface IWeatherProvider {

    int getWeather(String city, Date date);
}
