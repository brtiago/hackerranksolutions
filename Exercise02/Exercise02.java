package Exercise02;

import java.util.*;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        int i = 0;
        while (i < q) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int s = a;
            int j = 0;

            String result = "";
            while (j < n) {
                s += Math.pow(2, j) * b;
                result += s + " ";
                j++;
            }
            System.out.println(result.trim());
            i++;
        }
        scanner.close();
    }
}