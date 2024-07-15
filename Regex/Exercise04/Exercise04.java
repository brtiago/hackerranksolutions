package Regex.Exercise04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise04 {

    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {
            String testString = in.nextLine();

            Pattern pattern = Pattern.compile("(\\p{Alnum}{2}\\s){2}\\p{Alnum}{2}");
            Matcher matcher = pattern.matcher(testString);

            System.out.println(matcher.find());
        }

    }
}
