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

    public double getAveragePaymentInDepartment(int department) {
        System.out.println("");
        double sum = 0;
        int workersInDepartment = 0;
        for (Worker worker : this.workers) {
            if (worker.getDepartment() == department) {
                sum += worker.getPayment();
                workersInDepartment++;
            }
        }
        return sum / workersInDepartment;
    }
}
