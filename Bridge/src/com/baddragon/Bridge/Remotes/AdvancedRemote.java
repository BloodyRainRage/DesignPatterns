package com.baddragon.Bridge.Remotes;

import com.baddragon.Bridge.Devices.Device;

public class AdvancedRemote extends Remote {

    private int lastVolume;
    private boolean muted;

    public AdvancedRemote(Device device) {
        super(device);
    }


    @Override
    public void volumeUp(){
        if(muted = false) super.volumeUp();
        else {
            mute();
            super.volumeUp();
        }
    }

    @Override
    public void volumeDown(){
        if(muted = false) super.volumeDown();
        else {
            unmute();
            super.volumeDown();
        }
    }


    private void mute(){

        lastVolume = device.getVolume();
        device.setVolume(0);
        muted = true;
        System.out.println(device.getName() + " muted");

    }

    private void unmute(){
        muted = false;
        device.setVolume(lastVolume);
        System.out.println(device.getName() + " unmuted");
    }

    public void muteButton(){
        if (muted) {
            mute();
        } else {
            unmute();
        }
    }
}
