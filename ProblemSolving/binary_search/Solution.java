package ProblemSolving.binary_search;

import java.util.Scanner;

public class Solution {


    class BinarySearch {

        public static int binarySearch(int[] list, int item) {
            if (isListEmpty(list)) {
                return -1;
            }

            int low = 0;
            int high = list.length -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int guess = list[mid];
                if (guess == item){
                    return mid;
                } else if (guess > item) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return -1;
        }

        public static boolean isListEmpty(int[] myList) {
            return (myList.length == 0) ? true : false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Informe o ítem a ser buscado");

        try (Scanner in = new Scanner(System.in)){
            int item = in.nextInt();
            //int[] lista = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
            int[] lista = {1, 3, 5, 7, 9 };
            System.out.println(BinarySearch.binarySearch(lista, 3));
            System.out.println(BinarySearch.binarySearch(lista, -1));
        }

    }

}
