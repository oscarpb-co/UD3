package ud4;

import java.util.Arrays;

public class Ejercicio007 {

    private static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        final int n = 100;
        int encontrados = 0;
        int[] posiciones = new int[n];
        int i = 2;
        while (encontrados < n) {
            if (esPrimo(i)) {
                posiciones[encontrados++] = i;

            }
            i++;

        }
        System.out.println(Arrays.toString(posiciones));

    }

}
