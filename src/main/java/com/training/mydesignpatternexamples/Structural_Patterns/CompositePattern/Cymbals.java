package com.training.mydesignpatternexamples.Structural_Patterns.CompositePattern;

import java.math.BigDecimal;

public class Cymbals implements Purchasable{

    private String name;
    private BigDecimal price;

    public Cymbals(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
