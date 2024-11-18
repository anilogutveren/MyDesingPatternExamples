package com.training.mydesignpatternexamples.Structural_Patterns.CompositePattern;

import java.math.BigDecimal;
import java.util.List;


/*
 * Burda önemli olan farkli nesneleri veya farkli nesneleri iceren listelerin hepsini bir composite olarak toplayip,
 * Open-Close prensibine uygun bir sekilde toplam fiyatini hesaplamak.
 */
public class CompositePatternApp {

    public static void main(String[] args) {

        Stand stand = new Stand("Stand", BigDecimal.valueOf(100));
        Snare snare = new Snare("Snare", BigDecimal.valueOf(200));
        Cymbals cymbals = new Cymbals("Cymbals", BigDecimal.valueOf(300));

        Tom tom1 = new Tom("Tom 1", BigDecimal.valueOf(50));

        DrumShell drumShell = new DrumShell("Drum Shell");
        drumShell.setToms(List.of(tom1));

        DrumSet drumSet = new DrumSet("Drum Kit");
        drumSet.getPurchasableItems().add(stand);
        drumSet.getPurchasableItems().add(snare);
        drumSet.getPurchasableItems().add(cymbals);
        drumSet.getPurchasableItems().add(drumShell);

        BigDecimal totalPrice = drumSet.getTotalPrice();

        System.out.println("Total price of drum kit: " + totalPrice);
    }

}
