package workforce;

public class Main {
    public static void main(String[] args) {
        Workforce firm = new Workforce(5);

        Worker worker1 = new Worker("Darek", "Kopałko", 2000.0, 'M', 10);
        Worker worker2 = new Worker("Marek", "Kopałko", 2500.0, 'M', 10);
        Worker worker3 = new Worker("Marek", "Kopałko", 3000.0, 'M', 10);

        firm.addWorker(worker1);
        firm.addWorker(worker2);
        firm.addWorker(worker3);

        firm.saveBinary("firm.bin");

        Workforce firm2 = new Workforce(5);
//        firm2.openBinary("firm.bin");
        System.out.println(firm2);
    }

}
