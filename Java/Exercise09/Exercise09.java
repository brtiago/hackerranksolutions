package Java.Exercise09;

import java.io.*;
import java.util.*;

public class Exercise09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String result = new StringBuilder(A).reverse().toString().equals(A) ? "Yes" : "No";

        sc.close();
        System.out.println(result);

    }
}