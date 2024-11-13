package com.training.mydesignpatternexamples.Creational_Patterns.FactoryPattern.WeatherFactoryExample;

import java.util.Date;

public class WeatherStationApp {

    public void main(String[] args) {
        // Factory Pattern Example
        showWeather();
    }

    private void showWeather() {
        IWeatherProvider weatherProvider = GetWeatherProvider();
        int weather = weatherProvider.getWeather("Istanbul", new Date());
        System.out.println("Hava Durumu: " + weather);
    }

    /**
     * Factory Method
     * Burada hangi servisi kullanacağımızı belirliyoruz.
     * Ilerde başka bir servisi kullanmak istersek sadece burayı değiştirmemiz yeterli olacak.
     * @return
     */
    private IWeatherProvider GetWeatherProvider() {
        return new AnadoluWeather();
    }
}
