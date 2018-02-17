package codeFights.theJourneyBegins;

public class CenturyFromYear {
    public static int centuryFromYearTest(int year) {
        String stringYear = String.valueOf(year);
        if (year >= 1 && year<=100){
            return 1;
        } else if (year >= 101 && year <= 1000){
            if (stringYear.length() == 3) {
                if (year % 100 == 0) {
                    return year / 100;
                }
                return year / 100 + 1;
            } else {
                return 10;
            }
        } else if (year>=1001 && year<=2005){
            if (year%100==0){
                return year/100;
            }
            return year/100+1;

        }

        return 0;
    }
}
