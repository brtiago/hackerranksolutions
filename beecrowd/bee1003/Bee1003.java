
package bee1003;

import java.util.Scanner;

public class Bee1003 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("SOMA = " + (a + b));
        }
    }

}