package codeFights.throughTheFog;

public class DepositProfit {
    public static int depositProfit(int deposit, int rate, int threshold) {
        int counter = 0;
        double doubleDeposit = (double) deposit;

        while (doubleDeposit < threshold){
            doubleDeposit += rate*(doubleDeposit/100.0);
            counter++;
        }
        return counter;
    }
}
