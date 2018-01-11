package workforce;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkforceTest {

//    Worker tests
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

    @Test(expected = IllegalArgumentException.class)
    public void testWhenGenderHasWrongValue(){
        Worker worker = new Worker("Darek", "Strojecki", 2500.0, 'X', 10);
    }

//    Workforce tests
    @Test(expected = IllegalArgumentException.class)
    public void testWorkforceConstructorWhenMaxWorkersIsMoreTandOneHoundred(){
        Workforce workforce = new Workforce(111);
    }

    @Test
    public void testWorkforceConstructorWhenMaxWorkersIsLessTandOneHoundred(){
        Workforce workforce = new Workforce(10);
        assertEquals(10, workforce.getEngagement());
        assertEquals(10, workforce.getWorkers().length);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddWorkerWhenWorkforceHasFull(){
        Workforce workforce = new Workforce(1);
        Worker worker1 = new Worker("Darek", "Strojecki", 2500.0, 'M', 10);
        Worker worker2 = new Worker("Marek", "Strojecki", 2000.0, 'M', 10);
        workforce.addWorker(worker1);
        workforce.addWorker(worker2);
    }
}
