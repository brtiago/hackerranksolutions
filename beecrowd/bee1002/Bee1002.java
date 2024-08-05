package beecrowd.bee1002;

import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;

        double radius = in.nextDouble();

        System.out.println("A=" + String.format("%.4f", pi * Math.pow(radius, 2)));
        in.close();
    }
}
