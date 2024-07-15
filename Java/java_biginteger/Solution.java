package Java.java_biginteger;

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }

    }
}
