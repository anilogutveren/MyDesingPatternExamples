package com.training.mydesignpatternexamples.Structural_Patterns.CompositePattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DrumSet {

    private String name;
    private List<Purchasable> purchasableItems;

    public DrumSet(String name) {
        this.name = name;
        this.purchasableItems = new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Purchasable item : purchasableItems) {
            totalPrice = totalPrice.add(item.getPrice());
        }
        return totalPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Purchasable> getPurchasableItems() {
        return purchasableItems;
    }

    public void setPurchasableItems(List<Purchasable> purchasableItems) {
        this.purchasableItems = purchasableItems;
    }
}
