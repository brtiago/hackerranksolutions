package Regex.Exercise03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise03 {
    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {
            String testString = in.nextLine();

            Pattern pattern = Pattern.compile("^(.{3}\\.){3}.{3}$");
            Matcher matcher = pattern.matcher(testString);

            System.out.println(matcher.find());

        }

    }
}
