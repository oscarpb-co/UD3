package ud4;

import java.util.Arrays;
import java.util.Scanner;

public class AceptaElReto002Redux {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX = 500_000;
        boolean[] bares = new boolean[MAX];

        int n;

        int minimo;

        while (in.hasNext()) {

            minimo = Integer.MAX_VALUE;

            while ((n = in.nextInt()) != 0) {

                bares[n] = true;

                minimo = Math.min(n, minimo);

            }

            for (int i = minimo; i <= MAX; i++) {

                if (!(bares[i])) {
                    System.out.println(i);
                    break;
                }

            }

        }

    }

}
