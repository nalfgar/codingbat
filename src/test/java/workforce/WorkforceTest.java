package workforce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WorkforceTest {

    @Test
    public void testDoesHeWorkInDepartment1(){
        Worker worker = new Worker("Darek", "Strojecki", 2500.0, 'M', 100);
        assertFalse(worker.doesHeWorkInDepartment(10));
    }

    @Test
    public void testDoesHeWorkInDepartment2(){
        Worker worker = new Worker("Darek", "Strojecki", 2500.0, 'M', 10);
        assertTrue(worker.doesHeWorkInDepartment(10));
    }
}
