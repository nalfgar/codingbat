package workforce;


// TODO - use Lombok (constructor, getter , setter, toString)
public class Worker {
    private String name;
    private String surname;
    private double salary;
    private char gender;
    private int department;

   public boolean doesHeWorkInDepartment(int departmentNumber) {
        return departmentNumber == department;
    }

    public Worker(String name, String surname, double salary, char gender, int department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        if (gender=='f' || gender=='m' || gender=='F' || gender=='M'){
            this.gender = Character.toLowerCase(gender);
        } else throw new IllegalArgumentException("Wrong gender, right values is [f|F|m|M]");
        this.department = department;
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
