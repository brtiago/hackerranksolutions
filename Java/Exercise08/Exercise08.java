package Java.Exercise08;

import java.util.Scanner;

public class Exercise08 {

    public static String getSmallestAndLargest(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0 || k > s.length()) {
            throw new IllegalArgumentException("Invalid input");
        }

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}