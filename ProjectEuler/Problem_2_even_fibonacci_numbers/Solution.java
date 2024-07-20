package ProjectEuler.Problem_2_even_fibonacci_numbers;


public class Solution {

    public static void main(String[] args) {
        int limit = 4_000_000;

        System.out.println("Fibonacci even sum: " + fiboEvenSum(10) + " // should return 10");
        System.out.println("Fibonacci even sum: " + fiboEvenSum(34) + " // should return 44");
        System.out.println("Fibonacci even sum: " + fiboEvenSum(60) + " // should return 44");
        System.out.println("Fibonacci even sum: " + fiboEvenSum(1000) + " // should return 798");
        System.out.println("Fibonacci even sum: " + fiboEvenSum(100000) + " // should return 60696");
        System.out.println("Fibonacci even sum: " + fiboEvenSum(4000000) + " // should return 4613732");
    }

    private static int fiboEvenSum(int limit) {
        int sum = 0;
        int primeiro = 1;
        int segundo = 2;

        while (primeiro <= limit) {
            if(primeiro % 2 == 0) {
                sum += primeiro;
            }
            int terceiro = primeiro + segundo;
            primeiro = segundo;
            segundo = terceiro;
        }

        return sum;
    }
}