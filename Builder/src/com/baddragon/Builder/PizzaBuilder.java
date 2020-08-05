package com.baddragon.Builder;

import com.baddragon.Pizza.Pizza;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public void createPizza(){
        pizza = new Pizza(); //creating a blank pizza
    }


    public abstract void buildDough();  //--\
    public abstract void buildSouce();  //---> those methods are setting up our pizza
    public abstract void buildFilling();//--/

    public Pizza getPizza() {
        return pizza;
    }


}
