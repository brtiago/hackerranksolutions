package beecrowd.bee1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Bee1012 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = in.readLine().split(" ");
        double pi = 3.14159;
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        double areaTriangulo = (a * c) / 2.0;
        double areaCirculo = pi * c * c;
        double areaTrapezio = ((a + b) * c) / 2.0;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        DecimalFormat df = new DecimalFormat("0.000");
        in.close();

        System.out.println("TRIANGULO: " + df.format(areaTriangulo));
        System.out.println("CIRCULO: " + df.format(areaCirculo));
        System.out.println("TRAPEZIO: " + df.format(areaTrapezio));
        System.out.println("QUADRADO: " + df.format(areaQuadrado));
        System.out.println("RETANGULO: " + df.format(areaRetangulo));
    }
}
