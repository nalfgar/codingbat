package workforce;


import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Workforce firm = new Workforce(5);
//        firm.importFromTextFile("firma.txt");
//
        Worker worker1 = new Worker("Darek", "Kopałko", 2000.0, 'M', 10);
        Worker worker2 = new Worker("Marek", "Kopałko", 2500.0, 'M', 10);
        Worker worker3 = new Worker("Marek", "Kopałko", 3000.0, 'M', 10);

        firm.addWorker(worker1);
        firm.addWorker(worker2);
        firm.addWorker(worker3);

//        firm.saveBinary("firm.bin");
//
//        Workforce firm2 = new Workforce(5);
//        firm2.openBinary("firm.bin");
//        System.out.println(firm2);

//        Point2D point3D0 = new Point2D(0.0, 0.0);
//        Point2D point3D1 = new Point2D(1.0, 1.0);
//        System.out.println(point3D0.distance(point3D1));

        try {
            XMLEncoder e = new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream("firm.xml")));
            e.writeObject(worker1);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }


    }

}
