package com.training.mydesignpatternexamples.Creational_Patterns.FactoryPattern.PizzaFactoryExample;

public class ChicagoStyleClamPizza extends Pizza{

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cut Pizza in quadratische for");
    }

}
