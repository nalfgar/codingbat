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
        assertEquals(0, workforce.getEngagement());
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

//    TODO object expectedWorkforce and workforce are the same in my opinion
//    TODO but assertEuqals return error?
//    @Test
//    public void testImportFromFile(){
//        Workforce expectedWorkforce = new Workforce(5);
//        Worker worker1 = new Worker("Jan", "Kowalski", 2000.00, 'M', 30);
//        Worker worker2 = new Worker("Jan", "Kaczmarski", 2500.0, 'M', 10);
//        Worker worker3 = new Worker("Janina", "Bielska", 2500.0, 'F', 10);
//        expectedWorkforce.addWorker(worker1);
//        expectedWorkforce.addWorker(worker2);
//        expectedWorkforce.addWorker(worker3);
//
//        Workforce workforce = new Workforce(5);
//        workforce.importFromTextFile("firma.txt");
//        assertEquals(expectedWorkforce, workforce);
//    }

//    TODO how to test when scanner.nextLine is in tested method?
//    @Test
//    public void testAddWorkerInteractive(){
//        Workforce workforce = new Workforce(1);
//        workforce.addWorkerIneractive();
//        assertEquals(1, workforce.getEngagement());
//
//    }
}
