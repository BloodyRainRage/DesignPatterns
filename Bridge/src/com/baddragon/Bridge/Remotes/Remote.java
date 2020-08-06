package com.baddragon.Bridge.Remotes;

import com.baddragon.Bridge.Devices.Device;

public class Remote {

    Device device;

    public Remote(Device device){
        this.device = device;
    }

    public void togglePower(){
        device.powerButton();
    }

    public void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 10);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }

}
