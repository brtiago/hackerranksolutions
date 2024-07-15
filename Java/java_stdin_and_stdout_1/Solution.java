package Java.java_stdin_and_stdout_1;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();
        scanner.close();

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);


    }
}
