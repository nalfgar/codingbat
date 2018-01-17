package firmA;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FirmATest {
    Worker worker0;
    Worker singleWorker;
    Firm firm;

    @Before
    public void setup(){
        worker0 = new Worker("Alan",
                "Starski",
                'M',
                10,
                1000,
                45,
                2,
                true);

        singleWorker = new Worker("John",
                "Kowalski",
                'M',
                1,
                1000,
                45,
                0,
                false);

        firm = new Firm();
    }

    @Test
    public void testAddWorker(){
        firm.addWorker(worker0);
        assertEquals(1, firm.getWorkers().size());
        firm.addWorker(singleWorker);
        assertEquals(2, firm.getWorkers().size());
    }

    @Test
    public void testRemoveWorkerAsWorker(){
        firm.addWorker(worker0);
        firm.addWorker(singleWorker);

        firm.removeWorker(worker0);
        assertEquals(1, firm.getWorkers().size());
        firm.removeWorker(singleWorker);
        assertEquals(0, firm.getWorkers().size());
    }

    @Test
    public void testRemoveWorkerAsIndex(){
        firm.addWorker(worker0);
        firm.addWorker(singleWorker);

        firm.removeWorker(0);
        assertEquals(1, firm.getWorkers().size());
    }
}
