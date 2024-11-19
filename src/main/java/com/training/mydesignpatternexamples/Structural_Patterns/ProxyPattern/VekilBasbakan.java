package com.training.mydesignpatternexamples.Structural_Patterns.ProxyPattern;

public class VekilBasbakan implements Basbakan {

    private Basbakan basbakan = new GercekBasbakan();

    @Override
    public void dertDinle(String dert) {
        System.out.println("Vekil Başbakan dert dinliyor : " + dert);
        basbakan.dertDinle(dert);
    }

    @Override
    public void isBul(String emir) {
        System.out.println("Vekil Başbakan iş buluyor : " + emir);
        basbakan.isBul(emir);
    }
}
