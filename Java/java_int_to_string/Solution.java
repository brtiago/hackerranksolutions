package Java.java_int_to_string;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);){
            int n = sc.nextInt();
            String s = Integer.toString(n);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
