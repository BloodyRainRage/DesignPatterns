package com.baddragon.Bridge.Devices;

import org.w3c.dom.ls.LSOutput;

public class Radio extends Device {

    private boolean enabled;
    private Integer volume;
    private Integer channel;

    public Radio(){
        enabled = true;
        volume = 100;
        channel = 10;
        name = "radio";
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void powerButton() {
        enabled = !enabled;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        if (volume <0) volume = 0;
        if (volume > 100) volume = 100;
        System.out.printf("Radio volume set %d\n", volume);
    }

    @Override
    public Integer getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        if (channel <95) channel = 180;
        if (channel > 180) channel = 95;
        System.out.printf("you are listening to radio station %d now \n", channel);
    }
}
