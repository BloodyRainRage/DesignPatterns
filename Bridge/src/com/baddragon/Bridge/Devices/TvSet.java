package com.baddragon.Bridge.Devices;

public class TvSet extends Device {

    private boolean enabled;
    private Integer volume;
    private Integer channel;

    public TvSet(){
        enabled = false;
        volume = 50;
        channel = 0;
        this.name = "TvSet";
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
        System.out.printf("Tv volume set %d \n", volume);
    }

    @Override
    public Integer getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        if (channel <0) channel = 99;
        if (channel > 99) channel = 0;
        System.out.printf("you are watching channel %d now \n", channel);
    }
}
