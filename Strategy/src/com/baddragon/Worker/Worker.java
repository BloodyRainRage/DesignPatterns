package com.baddragon.Worker;

import com.baddragon.Worker.Jobs.IJob;

public class Worker {

    public void doWork(IJob job){

        if (job != null)
            job.doJob();
    }


}
