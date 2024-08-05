package beecrowd.bee1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Bee1015 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] parts1 = in.readLine().split(" ");
        String[] parts2 = in.readLine().split(" ");

        double x1 = Double.parseDouble(parts1[0]);
        double y1 = Double.parseDouble(parts1[1]);
        double x2 = Double.parseDouble(parts2[0]);
        double y2 = Double.parseDouble(parts2[1]);

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        in.close();

        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println(df.format(distance));

    }
}
