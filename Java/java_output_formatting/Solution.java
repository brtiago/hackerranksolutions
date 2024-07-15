package Java.java_output_formatting;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int num;

        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            str = scanner.next();
            num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.println("================================");

        scanner.close();
    }
}
