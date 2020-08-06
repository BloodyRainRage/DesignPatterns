package com.baddragon.Human;

public class Human implements Cloneable{

    private Integer age;
    private String name;

    public Human(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Human age=" + age +
                ", name=" + name;
    }

    public Human(Human source){
        name = source.name;
        age  = source.age;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
