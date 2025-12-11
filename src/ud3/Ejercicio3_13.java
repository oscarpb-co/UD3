package ud3;

import java.util.Scanner;

public class Ejercicio3_13 {

    private static double getPotencia(double x, int n) {
        if (n == 1) {
            return x;
        }

        return x * getPotencia(x, (n - 1));

    }

    private static double getPotenciaNegativa(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / getPotencia(x, -n);
        }
        return getPotencia(x, n);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = in.nextInt();

        System.out.println("La potencia " + n + " de " + x + " es " + getPotencia(x, n));

    }

}
