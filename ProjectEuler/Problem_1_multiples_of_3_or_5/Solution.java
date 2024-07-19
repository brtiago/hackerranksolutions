package ProjectEuler.Problem_1_multiples_of_3_or_5;

public class Solution {

    public static void main(String[] args) {

        System.out.println("Multiples of 3 or 5: " + multiplesOf3or5(10) + " // should return 23");
        System.out.println("Multiples of 3 or 5: " + multiplesOf3or5(49) + " // should return 543");
        System.out.println("Multiples of 3 or 5: " + multiplesOf3or5(1000) + " // should return 233168");
        System.out.println("Multiples of 3 or 5: " + multiplesOf3or5(8456) + " // should return 16687353");
        System.out.println("Multiples of 3 or 5: " + multiplesOf3or5(19564) + " // should return 89301183");

    }

    private static int multiplesOf3or5(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}
