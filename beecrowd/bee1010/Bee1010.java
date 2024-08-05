package beecrowd.bee1010;

import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {
            double total = 0;
            for (int i = 0; i < 2; i++) {
                int barCode = in.nextInt();
                int quantity = in.nextInt();
                double value = in.nextDouble();
                total += quantity * value;
            }
            System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        }

    }
}
