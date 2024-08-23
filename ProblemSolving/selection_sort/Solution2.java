package ProblemSolving.selection_sort;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    private static int[] selectionSort(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr[i] = arr[smallest];

            arr[smallest] = 999999999;
        }

        return newArr;
    }

    private static int findSmallest(int[] arr) {
        int smallest = arr[0];

        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
