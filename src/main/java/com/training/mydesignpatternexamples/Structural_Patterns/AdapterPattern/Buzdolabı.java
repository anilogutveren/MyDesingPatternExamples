package com.training.mydesignpatternexamples.Structural_Patterns.AdapterPattern;


public class Buzdolabı implements ElektrikliEvAletleri {

    private int volt;

    public Buzdolabı() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {

        System.out.println("Buzdolabı çalışıyor.");
        return volt;
    }
}
