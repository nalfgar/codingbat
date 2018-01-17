package zadLukaszL;

public class App {
    public static long getHighestPalindrome(int a, int b){
        long currentHighestPalindrome;
        long highestPalindrome = 0L;
        long result;
        long reversedResult;

        for(int x = a; x >= 10000; x--){
            if((x % 2) == 0){
                continue;
            }
            for(int y = b; y >= 10000; y--){
                if((y % 2) == 0){
                    continue;
                }
                String reverse = "";
                result = x*y;
                String resultAsString = Long.toString(result);
                for (int i = resultAsString.length()-1; i >= 0; i--) {
                    reverse += resultAsString.charAt(i);
                }
                reversedResult = Long.parseLong(reverse);
                if(result == reversedResult){
                    currentHighestPalindrome = result;
                    if (currentHighestPalindrome > highestPalindrome){
                        highestPalindrome = currentHighestPalindrome;
                    }
                }
            }
        }
        return highestPalindrome;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("The highest number-palindrome is: " + getHighestPalindrome(10000, 99999)); //tutaj wskazałem przykładowe liczby testowe
        System.out.println("Total time in milliseconds is: "+(System.currentTimeMillis()-startTime));
    }
}
