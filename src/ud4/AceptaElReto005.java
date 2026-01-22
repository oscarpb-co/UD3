package ud4;

import java.util.Scanner;

public class AceptaElReto005 {

    public static int getTinta(int cuadradoL) {
        if (cuadradoL == 1) {
            return 4;
        }

        return 4 * cuadradoL + 4 * getTinta(cuadradoL / 2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cuadradoL;

        while (in.hasNext()) {
            cuadradoL = in.nextInt();
            System.out.println(getTinta(cuadradoL));
        }

    }

}
