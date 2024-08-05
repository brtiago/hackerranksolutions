package beecrowd.bee1035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bee1035 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = in.readLine().split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);

        in.close();

        if ((b > c) && (d > a) && ((c + d) > (a + b)) && ((c > 0) && (d > 0)) && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
