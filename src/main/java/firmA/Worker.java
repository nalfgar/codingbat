package firmA;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Worker {
    private String name;
    private String surnname;
    private char gender;
    private int department;
    private double payment;
    private int age;
    private int numberOfChildren;
    private boolean civilStatus;

//    public void

    public String toStringTrimmed() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surnname='" + surnname + '\'' +
                ", payment=" + payment +
                '}';
    }

    public String toStringSpecial() {
        return "Worker{" +
                "name='" + name.toUpperCase() + '\'' +
                ", surnname='" + surnname.toUpperCase() + '\'' +
                '}';
    }


    public boolean isPaymentHigher(double payment) {
        return this.payment < payment;
    }
}
