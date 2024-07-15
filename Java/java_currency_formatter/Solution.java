package Java.java_currency_formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // BufferedReader payment = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment).replace("$","Rs."));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        sc.close();
    }
}
