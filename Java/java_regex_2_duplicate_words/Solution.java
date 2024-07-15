package Java.java_regex_2_duplicate_words;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {
            int numberOfSentences = in.nextInt();
            in.nextLine();

            String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";

            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            while(numberOfSentences-- > 0) {
                String sentence = in.nextLine();
                Matcher matcher = pattern.matcher(sentence);

                while(matcher.find()) {
                    sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
                }
                System.out.println(sentence);
            }
        }

    }
}