package Java.java_strings_introduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        sc.close();
        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(capitalize(a) + " " + capitalize(b));
    }

    private static String capitalize(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}