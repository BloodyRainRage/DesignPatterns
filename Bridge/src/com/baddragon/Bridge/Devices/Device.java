package com.baddragon.Bridge.Devices;

public abstract class Device {

    protected String name;

    public String getName(){
        return this.name;
    }

    public abstract boolean isEnabled();
    public abstract void powerButton();

    public abstract Integer getVolume();
    public abstract void setVolume(int percent);

    public abstract Integer getChannel();
    public abstract void setChannel(int channel);

}
