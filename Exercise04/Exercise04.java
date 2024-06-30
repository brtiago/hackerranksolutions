package Exercise04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int b = sc.nextInt();
            int h = sc.nextInt();

            if (b <= 0 || h <= 0) throw new Exception("java.lang.Exception: Breadth and height must be positive");

            System.out.println(b * h);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
