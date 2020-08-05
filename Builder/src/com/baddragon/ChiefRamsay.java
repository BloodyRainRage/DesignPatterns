package com.baddragon;

import com.baddragon.Builder.PizzaBuilder;
import com.baddragon.Pizza.Pizza;

public class ChiefRamsay {

    private PizzaBuilder builder;

    public ChiefRamsay(PizzaBuilder builder){
        this.builder = builder;
    }

    public void changeBuilder(PizzaBuilder builder){
        this.builder = builder;
    }

    public Pizza makePizza(){
        builder.createPizza(); // creating a blank pizza

        builder.buildDough();
        builder.buildSouce();
        builder.buildFilling();

        return builder.getPizza(); //returning a fresh and hot pizza
    }

}
