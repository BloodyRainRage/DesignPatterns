package com.baddragon;

import com.baddragon.Bridge.Devices.Radio;
import com.baddragon.Bridge.Devices.TvSet;
import com.baddragon.Bridge.Remotes.AdvancedRemote;
import com.baddragon.Bridge.Remotes.Remote;

public class Main {

    public static void main(String[] args) {

        AdvancedRemote remote = new AdvancedRemote(new TvSet());

        remote.channelDown();
        remote.muteButton();

        remote.volumeUp();


        Remote radioRemote = new Remote(new Radio());

        radioRemote.channelUp();


        radioRemote.volumeUp();


    }
}
