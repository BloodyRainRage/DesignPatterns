package com.baddragon.Builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("thin");
    }

    @Override
    public void buildSouce() {
        pizza.setSouce("mild");
    }

    @Override
    public void buildFilling() {
        pizza.setFilling("ham + pineapple");
    }
}
