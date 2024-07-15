package Regex.matching_digits_non_digit_character;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Pattern pattern = Pattern.compile("\\d{2}\\D\\d{2}\\D\\d{4}");
        Matcher matcher = pattern.matcher(s);

        boolean matchFound = matcher.find();
        String result = matchFound ? "true" : "false";
        System.out.println(result);

        sc.close();

    }
}
