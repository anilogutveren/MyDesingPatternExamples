package com.training.mydesignpatternexamples.Structural_Patterns.AdapterPattern;

/**
 * EEA --> Elektrikli Ev Aleti (sinifin ismine bak)
 */
public class TelefonEEAAdapter implements ElektrikliEvAletleri {

    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
