package beecrowd.bee1036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Bee1036 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = in.readLine().split(" ");

        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        double delta = Math.pow(b, 2) - 4 * a * c;

        in.close();

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {

            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            DecimalFormat df = new DecimalFormat("0.00000");

            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));

        }

    }
}
