package com.baddragon;

import com.baddragon.Builder.HawaiianPizzaBuilder;
import com.baddragon.Builder.PizzaBuilder;
import com.baddragon.Builder.SpicyPizzaBulder;
import com.baddragon.Pizza.Pizza;

public class Main {

    public static void main(String[] args) {


        ChiefRamsay chief = new ChiefRamsay(new HawaiianPizzaBuilder());

        Pizza pizza = chief.makePizza();

        System.out.println("\nNEW ORDER:");
        System.out.println(pizza.toString());

        chief.changeBuilder(new SpicyPizzaBulder());
        pizza = chief.makePizza();
        System.out.println("\nNEW ORDER:");
        System.out.println(pizza);
    }
}
