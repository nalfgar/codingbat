package workforce;

public class Main {
    public static void main(String[] args) {
        Workforce firm = new Workforce(5);
        firm.addWorkerIneractive();
        firm.addWorkerIneractive();

        System.out.println(firm);
    }

}
