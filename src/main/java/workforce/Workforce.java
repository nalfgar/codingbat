package workforce;

public class Workforce {
    private final int MAX_WORKERS = 100;
    private Worker[] workers;
    private int engagement;

    public Workforce(int i) {
        if (i > MAX_WORKERS) {
            throw new IllegalArgumentException("Max i is 100.");
        }
        workers = new Worker[i];
        engagement = i;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public int getEngagement() {
        return engagement;
    }
}
