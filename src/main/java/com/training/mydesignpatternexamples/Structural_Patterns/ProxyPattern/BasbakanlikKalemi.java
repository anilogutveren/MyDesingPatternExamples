package com.training.mydesignpatternexamples.Structural_Patterns.ProxyPattern;

public class BasbakanlikKalemi {

    private Basbakan basbakan;

    public BasbakanlikKalemi(){
        basbakan = new VekilBasbakan();
    }

    public Basbakan banaBasbakaniVer(){
        System.out.println("Basbakanlık Kalemi: Tabi efendim");
        return basbakan;
    }
}
