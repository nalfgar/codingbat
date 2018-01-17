package firmA;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class Firm implements Serializable {
    private List<Worker> workers;

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public Firm() {
        this.workers = new ArrayList<>();
    }

    public void removeWorker(Worker worker) {
        this.workers.remove(worker);
    }

    public void removeWorker(int index) {
        this.workers.remove(index);
    }

    public double getAveragePaymentInDepartment(int department) throws Exception {
        double sum = 0;
        int workersInDepartment = 0;

        if (isDepartmentInFirm(department)) {
            for (Worker worker : this.workers) {
                if (worker.getDepartment() == department) {
                    sum += worker.getPayment();
                    workersInDepartment++;
                }
            }
            return sum / workersInDepartment;
        } else {
            throw new Exception("There is not department number: " + department + " in firm");
        }
    }

    private boolean isDepartmentInFirm(int department) {
        boolean result = false;
        for (Worker worker : this.workers) {
            if (worker.getDepartment() == department) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void increasePaymentForFirmForTenPercent() {
        for (Worker worker : this.workers) {
            worker.increasePaymentForPercent(10);
        }
    }

    public double increasePaymentForFirmForValue(double value) {
        double sumIncreaseForWomen = 0;
        double sumIncreaseForMen = 0;

        for (Worker worker : workers) {
            worker.increasePaymentForValue(value);
            if (worker.getGender() == 'F') {
                sumIncreaseForWomen += value;
            } else {
                sumIncreaseForMen += value;
            }
        }
        System.out.println("Kobiety dostały: " + sumIncreaseForWomen + " podwyżki");
        System.out.println("Mężczyźni dostali: " + sumIncreaseForMen + " podwyżki");

        return sumIncreaseForWomen / sumIncreaseForMen;
    }

    public void serialize(String name) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(name))) {
            outputStream.writeObject(workers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(String name) {
        List<Worker> workerList = null;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(name))){
//            why can't cast to Firm?
//            workerList = (Firm) objectInputStream.readObject();
            workerList = (ArrayList<Worker>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.workers = workerList;
    }
}
