package workforce;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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

    public void addWorker(Worker worker) {
        if (engagement > workers.length) {
            throw new ArrayIndexOutOfBoundsException("Firm is full, has " + engagement + " workers.");
        }
        workers[engagement] = worker;
        engagement++;
    }

    public void addWorkerIneractive() {
        addWorker(Worker.workerInteractive());
    }

    public void importFromTextFile(String s) {
        File file = new File(s);
        String line;
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                line = scanner.nextLine();
                addWorker(Worker.workerFromString(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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

    public double averageSalary() {
        double sumSalary = 0;
        int counter = 0;
        for (Worker worker : workers) {
            if (worker != null) {
                sumSalary += worker.getSalary();
                counter++;
            } else break;
        }

        return sumSalary / engagement;
    }

    public double averageSalary(int department) {
        double sumSalary = 0;
        int counter = 0;
        for (Worker worker:workers){
            if (worker!=null && worker.getDepartment() == department){
                sumSalary += worker.getSalary();
                counter++;
            } else break;
        }

        return sumSalary/counter;
    }
}
