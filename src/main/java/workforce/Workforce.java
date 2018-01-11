package workforce;

import java.util.Arrays;

public class Workforce {
    private final int MAX_WORKERS = 100;
    private Worker[] workers;
    private int engagement;


    public Workforce(int i) {
        if (i > MAX_WORKERS) {
            throw new IllegalArgumentException("Max i is 100.");
        }
        workers = new Worker[i];
        engagement = 0;
    }

    public void addWorker(Worker worker){
        if (engagement > workers.length) {
            throw new ArrayIndexOutOfBoundsException("Firm is full, has " + engagement + " workers.");
        }
        workers[engagement] = worker;
        engagement++;
    }

    public void addWorkerIneractive() {
        addWorker(Worker.workerInteractive());
    }


    public Worker[] getWorkers() {
        return workers;
    }

    public int getEngagement() {
        return engagement;
    }

    @Override
    public String toString() {
        return "Workforce{" +
                "workers=" + Arrays.toString(workers) +
                ", engagement=" + engagement +
                '}';
    }
}
