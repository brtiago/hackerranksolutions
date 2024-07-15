package Java.java_stdin_and_stdout_2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        double secondLine = scanner.nextDouble();
        String thirdLine = scanner.next();
        scanner.close();

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);

    }
}