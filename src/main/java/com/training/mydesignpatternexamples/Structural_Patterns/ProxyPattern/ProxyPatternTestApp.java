package com.training.mydesignpatternexamples.Structural_Patterns.ProxyPattern;

public class ProxyPatternTestApp {
    public static void main(String[] args) {
        BasbakanlikKalemi kalem = new BasbakanlikKalemi();
        Vatandas vatandas = new Vatandas(kalem);
        vatandas.derdiniAnlat();
        vatandas.isIste();
    }
}
