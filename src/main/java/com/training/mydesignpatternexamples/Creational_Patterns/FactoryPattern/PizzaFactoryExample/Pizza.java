package com.training.mydesignpatternexamples.Creational_Patterns.FactoryPattern.PizzaFactoryExample;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    void prepare() {
        System.out.println("Vorbereitungen für: " + name);
        System.out.println("Knete Teig...");
        System.out.println("Füge Soße hinzu...");
        System.out.println("Füge Beläge hinzu: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake() {
        System.out.println("Backe für 25 Minuten bei 350 Grad");
    }
    void cut() {
        System.out.println("Schneide Pizza diagonal in Stücke");
    }
    void box() {
        System.out.println("Lege Pizza in offiziellen PizzaStore-Karton");
    }
    public String getName() {
        return name;
    }
}