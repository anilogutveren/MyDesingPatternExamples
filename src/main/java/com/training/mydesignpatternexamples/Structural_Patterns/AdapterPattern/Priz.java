package com.training.mydesignpatternexamples.Structural_Patterns.AdapterPattern;


public class Priz {

    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){

        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor");

    }
}
