package com.baddragon.Worker.Jobs;

public class HandJob implements IJob {

    @Override
    public void doJob(){
        System.out.println("Hand job");
    }

}
