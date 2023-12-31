// https://www.hackerrank.com/challenges/java-currency-formatter/problem
// java 7 is used
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double payment = s.nextDouble(); // Replace with your amount

        // Format the amount in US currency
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
