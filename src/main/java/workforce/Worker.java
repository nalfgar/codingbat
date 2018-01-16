package workforce;


import java.io.Serializable;
import java.util.Scanner;

// TODO - use Lombok (constructor, getter , setter, toString)
public class Worker implements Serializable{

    private String name;
    private String surname;
    private double salary;
    private char gender;
    private int department;

   public boolean doesHeWorkInDepartment(int departmentNumber) {
        return departmentNumber == department;
   }


   public Worker(String name, String surname, double salary, char gender, int department) {
       System.out.println("konstruktor: " + getClass().getName());
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        if (gender=='f' || gender=='m' || gender=='F' || gender=='M'){
            this.gender = Character.toLowerCase(gender);
        } else throw new IllegalArgumentException("Wrong gender, right values is [f|F|m|M]");
        this.department = department;
    }

    public static Worker workerInteractive(){

        Scanner scanner = new Scanner(System.in);

        String name;
        String surname;
        double salary;
        char gender;
        int department;

        System.out.println("Dane użytkownika:");
        System.out.print("Imię: ");
        name = scanner.nextLine();
        System.out.print("Nazwisko: ");
        surname = scanner.nextLine();
        System.out.print("Pobory: ");
        salary = Double.valueOf(scanner.nextLine());
        System.out.print("Płeć [m|f]: ");
        gender = scanner.nextLine().charAt(0);
        System.out.print("Wydział: ");
        department = Integer.valueOf(scanner.nextLine());
        return new Worker(name, surname, salary, gender, department);
    }

    public static Worker workerFromString(String line) {
        String name;
        String surname;
        double salary;
        char gender;
        int department;

        String[] data = line.split("\\s+");
        name = data[0];
        surname = data[1];
        salary = Double.valueOf(data[2]);
        gender = data[3].charAt(0);
        department = Integer.valueOf(data[4]);

        return new Worker(name, surname, salary, gender, department);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", department=" + department +
                '}';
    }

}
