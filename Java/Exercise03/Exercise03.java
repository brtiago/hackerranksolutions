package Java.Exercise03;

import java.util.*;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int i = 0;
        do {
            String number = sc.next();
            try {
                long n = Long.parseLong(number);
                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) System.out.println("* byte");
                if (n >= -32_768 && n <= 32_767) System.out.println("* short");
                if (n >= -Math.pow(2, 31) && n <= (Math.pow(2, 31) - 1)) System.out.println("* int");
                if (n >= -Math.pow(2, 63) && (n <= (Math.pow(2, 63) - 1))) System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println(number + " can't be fitted anywhere.");
            }
            i++;
        } while (i < T);
        sc.close();
    }
}