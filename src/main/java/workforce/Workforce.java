package workforce;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Workforce implements Serializable{
    private final int MAX_WORKERS = 100;
    private Worker[] workers;
    private int engagement;


    public Workforce(int i) {
//        System.out.println("konstruktor: " + getClass().getName());
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

    public void importFromTextFile(String fileName) {
        File file = new File(fileName);
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

    public int[] getDepartment() {
        int[] departments = new int[engagement];

        for (int i = 0; i < engagement; i++) {
            departments[i] = workers[i].getDepartment();
        }

        return onlyUniqe(departments);
    }

    private int[] onlyUniqe(int[] departments) {
        Map<Integer , Integer> departmentsMap = new HashMap<>();
        for (int department : departments) {
            if (!departmentsMap.containsKey(department)) {
                departmentsMap.put(department, 0);
            }
        }

        int[] result = new int[departmentsMap.size()];
        int counter = 0;
        for (Map.Entry<Integer, Integer> department : departmentsMap.entrySet()) {
            result[counter] = department.getKey();
            counter++;
        }

        return result;
    }


    public void saveBinary(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void openBinary(String fileName) {
        Workforce workforce;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            workforce = (Workforce) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
