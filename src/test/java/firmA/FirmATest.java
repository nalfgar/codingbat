package firmA;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FirmATest {
    Worker worker0;
    Worker worker1;
    Worker singleWorker;

    Firm firm;
    Firm firmFull;
    Firm firmFull2;

    @Before
    public void setup(){
        worker0 = new Worker("Alan",
                "Starski",
                'M',
                10,
                1100,
                45,
                2,
                true);

        worker1 = new Worker("Janet",
                "Jackson",
                'F',
                10,
                1200,
                25,
                1,
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
        firmFull = new Firm();
        firmFull.addWorker(worker0);
        firmFull.addWorker(worker1);
        firmFull.addWorker(singleWorker);

        firmFull2 = new Firm();
        firmFull2.addWorker(worker0);
        firmFull2.addWorker(worker1);
        firmFull2.addWorker(singleWorker);
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

        firmFull.removeWorker(worker0);
        assertEquals(2, firmFull.getWorkers().size());
        firmFull.removeWorker(worker1);
        assertEquals(1, firmFull.getWorkers().size());
    }

    @Test
    public void testRemoveWorkerAsIndex(){

        firmFull.removeWorker(0);
        assertEquals(2, firmFull.getWorkers().size());
    }

    @Test(expected = Exception.class)
    public void testGetAveragePaymentInDepartmentWhenInFirmAbsentDepartment() throws Exception {
        firmFull.getAveragePaymentInDepartment(1000);
    }

    @Test
    public void testGetAveragePaymentInDepartment() throws Exception {

        assertEquals(1150.0, firmFull.getAveragePaymentInDepartment(10), 0.001);
    }

    @Test
    public void testIncreasePaymentForFirmForTenPercent(){
        firmFull.increasePaymentForFirmForTenPercent();

        assertEquals(1287.0, firmFull.getWorkers().get(0).getPayment(), 0.001);
        assertEquals(1380.0, firmFull.getWorkers().get(1).getPayment(), 0.001);
        assertEquals(1100.0, firmFull.getWorkers().get(2).getPayment(), 0.001);
    }

    @Test
    public void testIncreasePaymentForFirmForValue(){
        assertEquals(0.5, firmFull.increasePaymentForFirmForValue(100.00), 0.001);
    }

    @Test
    public void testSerializeDeserialize() throws InterruptedException {
        firmFull.serialize("object-graph.bin");
        firmFull.deserialize("object-graph.bin");
        assertEquals(firmFull2, firmFull);
        assertFalse(firmFull == firmFull2);
    }
}
