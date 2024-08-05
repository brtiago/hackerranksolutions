package ProblemSolving.time_conversion;
import java.io.*;
import java.text.*;
import java.util.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String timeConversion(String s) throws ParseException {
        // Write your code here
        SimpleDateFormat militaryFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        SimpleDateFormat ampmFormat = new SimpleDateFormat("hh:mm:ssaa", Locale.US);

        return (militaryFormat.format(ampmFormat.parse(s)));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}