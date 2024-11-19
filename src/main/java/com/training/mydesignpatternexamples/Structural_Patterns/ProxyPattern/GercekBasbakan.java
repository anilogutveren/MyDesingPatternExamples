package com.training.mydesignpatternexamples.Structural_Patterns.ProxyPattern;

public class GercekBasbakan implements Basbakan {

    @Override
    public void dertDinle(String dert) {
        System.out.println("Başbakan dert dinliyor : " + dert);
    }

    @Override
    public void isBul(String emir) {
        System.out.println("Başbakan iş buluyor : " + emir);
    }
}
