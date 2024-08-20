package ProblemSolving.max_consecutive_ones;

public class Solution {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int a = findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        int b = findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1});

        System.out.println(a); // Deveria ser 3
        System.out.println(b); // Deveria ser 2

    }
}
