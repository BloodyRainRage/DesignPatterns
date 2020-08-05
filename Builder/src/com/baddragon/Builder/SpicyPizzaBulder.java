package com.baddragon.Builder;

public class SpicyPizzaBulder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSouce() {
        pizza.setSouce("hot");
    }

    @Override
    public void buildFilling() {
        pizza.setFilling("peperoni + salami");
    }
}
