package com.baddragon.Pizza;

public class Pizza {

    protected String dough;
    protected String souce;
    protected String filling;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString(){
        return "Dough: " + dough +
                "\nSouce: " + souce +
                "\nFilling: " + filling;
    }

}
