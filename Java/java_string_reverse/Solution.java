package Java.java_string_reverse;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String result = new StringBuilder(A).reverse().toString().equals(A) ? "Yes" : "No";

        sc.close();
        System.out.println(result);

    }
}