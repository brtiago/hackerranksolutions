package Java.valid_username_regex;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            while(n-- != 0) {
                String username = in.nextLine();
                boolean matchFound = username.matches(MyRegex.pattern);
                System.out.println(matchFound ? "Valid" : "Invalid");
            }

        }
    }

    class MyRegex {
        public static final String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    }
}
