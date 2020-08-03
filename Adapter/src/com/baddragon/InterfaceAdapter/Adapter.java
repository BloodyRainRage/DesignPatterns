package com.baddragon.InterfaceAdapter;
import com.baddragon.Class.SuperClass;

public class Adapter extends SuperClass implements IAdapter {

    @Override
    public void method(){
        this.superMethod();
    }

}
