package Regex.matching_specific_string;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("hackerrank");
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        while(matcher.find()){
            count++;
        }

        System.out.println("Number of matches : " + count);
        sc.close();
    }
}