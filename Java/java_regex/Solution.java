package Java.java_regex;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            while(in.hasNext()) {
                String ip = in.nextLine();
                System.out.println(ip.matches(MyRegex.pattern));
            }

        }
    }

    class MyRegex {
        public static final String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
}
