package firmA;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class Firm {
    private List<Worker> workers;

    public void addWorker(Worker worker){
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
}
