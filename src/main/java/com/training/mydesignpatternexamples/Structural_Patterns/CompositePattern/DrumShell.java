package com.training.mydesignpatternexamples.Structural_Patterns.CompositePattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DrumShell implements Purchasable{

    private String name;
    private List<Tom> toms;

    public DrumShell(String name) {
        this.name = name;
        this.toms = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Tom tom : toms) {
            totalPrice = totalPrice.add(tom.getPrice());
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tom> getToms() {
        return toms;
    }

    public void setToms(List<Tom> toms) {
        this.toms = toms;
    }
}
