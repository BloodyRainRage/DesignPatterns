package com.baddragon.Human;

import com.baddragon.Human.Human;

public class Laboratory {

    protected static Human example;
    static {
        example = new Human(12, "Alice");
    }


    public static Human makeAlice() throws CloneNotSupportedException {
        return (Human) example.clone();
    }

}
