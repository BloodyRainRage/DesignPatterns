package com.baddragon;

import com.baddragon.Worker.Jobs.HandJob;
import com.baddragon.Worker.Jobs.FootJob;
import com.baddragon.Worker.Worker;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.doWork(new HandJob());
        worker.doWork(new FootJob());

    }
}
