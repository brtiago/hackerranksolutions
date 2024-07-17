package Java.java_primality_test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(bufferedReader.readLine());
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
        bufferedReader.close(); */

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger n = new BigInteger(bufferedReader.readLine());
            System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
        }

    }
}
