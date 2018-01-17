package firmA;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
