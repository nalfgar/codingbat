package firmA;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WorkerTest {
    private Worker worker;
    private Worker singleWorker;

    @Before
    public void setup(){
        worker = new Worker("Alan",
                "Starski",
                'M',
                10,
                1000,
                45,
                2,
                true);

        singleWorker = new Worker("Alan",
                "Starski",
                'M',
                10,
                1000,
                45,
                0,
                false);
    }


    @Test
    public void testToStringTrimmed(){
        String trimmedWorker = "Worker{name='Alan', surnname='Starski', payment=1000.0}";

        assertEquals(trimmedWorker, worker.toStringTrimmed());
    }

    @Test
    public void testToStringSpecial(){
        String trimmedWorker = "Worker{name='ALAN', surnname='STARSKI'}";

        assertEquals(trimmedWorker, worker.toStringSpecial());
    }

    @Test
    public void testIsPaymentHigher(){

        assertTrue(worker.isPaymentHigher(2000.0));
        assertFalse(worker.isPaymentHigher(1000.0));
        assertFalse(worker.isPaymentHigher(100.0));
    }

    @Test
    public void testIncreasePaymentForSingleWorker(){

        singleWorker.increasePaymentForPercent(5.0);
        assertEquals(1050.0, singleWorker.getPayment(), 0.001);
    }

    @Test
    public void testIncreasePaymentForHusbandWithChildren(){

        worker.increasePaymentForPercent(5.0);
        assertEquals(1120.0, worker.getPayment(), 0.001);
    }



}
