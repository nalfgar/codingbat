package firmA;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Worker implements Serializable{
    private String name;
    private String surnname;
    private char gender;
    private int department;
    private double payment;
    private int age;
    private int numberOfChildren;
    private boolean civilStatus;

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

    public void increasePaymentForPercent(double increase) {
        double percent = this.payment / 100;

        if (this.civilStatus) {
            this.payment = (percent * increase)
                        + (percent * this.numberOfChildren * 2)
                        + (percent * 3)
                        + this.payment;
        } else {
            this.payment = (percent * increase)
                        + (percent * this.numberOfChildren * 2)
                        + this.payment;
        }
    }


    public void increasePaymentForValue(double value) {
        this.setPayment(this.getPayment() + value);
    }
}
