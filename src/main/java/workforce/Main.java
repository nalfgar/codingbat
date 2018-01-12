package workforce;

public class Main {
    public static void main(String[] args) {
        Workforce firm = new Workforce(5);
        firm.importFromTextFile("firma.txt");

        System.out.println(firm);
    }

}
