package Java.java_anagrams;

import java.util.*;

public class Solution {

    private static boolean isAnagram(String a, String b){
        if (a == null || b == null) return false;

        a = a.toLowerCase(Locale.ROOT);
        b = b.toLowerCase(Locale.ROOT);

        if (a.length() != b.length()) return false;

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        sc.close();

        String result = isAnagram(a, b) ? "Anagrams" : "Not Anagrams";
        System.out.println(result);
    }
}