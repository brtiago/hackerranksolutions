package beecrowd.bee1021;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bee1021 {

    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {
            double cash = in.nextDouble();

            int[] bankNotes = {10_000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
            BigDecimal tempMoney = BigDecimal.valueOf(cash).multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.HALF_UP);
            int tempMoneyInCents = tempMoney.intValueExact();

            int[] money = new int[bankNotes.length];

            for (int i = 0; i < bankNotes.length; i++) {
                money[i] = Math.floorDiv(tempMoneyInCents, bankNotes[i]);
                tempMoneyInCents %= bankNotes[i];
            }

            System.out.println("NOTAS:\n" +
                    money[0] + " nota(s) de R$ 100.00\n" +
                    money[1] + " nota(s) de R$ 50.00\n" +
                    money[2] + " nota(s) de R$ 20.00\n" +
                    money[3] + " nota(s) de R$ 10.00\n" +
                    money[4] + " nota(s) de R$ 5.00\n" +
                    money[5] + " nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    money[6] + " moeda(s) de R$ 1.00\n" +
                    money[7] + " moeda(s) de R$ 0.50\n" +
                    money[8] + " moeda(s) de R$ 0.25\n" +
                    money[9] + " moeda(s) de R$ 0.10\n" +
                    money[10] + " moeda(s) de R$ 0.05\n" +
                    money[11] + " moeda(s) de R$ 0.01"
            );

            // Arrays.stream(possibleMoney).forEach(System.out::println);

        }

    }
}
