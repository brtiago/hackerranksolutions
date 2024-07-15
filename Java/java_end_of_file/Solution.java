package Java.java_end_of_file;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            String line = sc.nextLine();
            System.out.println(i +" "+ line);
            i++;
        } while(sc.hasNext());
        sc.close();
    }
}
