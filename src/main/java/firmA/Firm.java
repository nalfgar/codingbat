package firmA;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class Firm {
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
            if (worker.getDepartment() == department){
                result = true;
                break;
            }
        }
        return result;
    }

    public void increasePaymentForFirm() {
        for (Worker worker : this.workers) {
            worker.increasePayment(10);
        }
    }
}
