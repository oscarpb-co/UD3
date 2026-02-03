package ud4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio22 {

    public static int[] rellenarRandom(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);

        }
        return v;
    }

    public static boolean getBusquedaLineal(int[] v, int n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                return true;
            }
        }
        return false;

    }

    public static boolean getBusquedaBinaria(int[] v, int n) {
        Arrays.sort(v);
        int desde = 0;
        int hasta = v.length - 1;
        int central;

        while (desde <= hasta) {
            central = (hasta + desde) / 2;

            if (v[central] == n) {
                return true;
            }

            if (n < v[central]) {
                hasta = central - 1;
            } else {
                desde = central + 1;
            }

        }

        return false;

    }

    public static int interno(int[] v, int n, int desde, int hasta) {
        if (hasta < desde) {
            return -1;
        }

        int central = (desde + hasta) / 2;

        if (v[central] == n) {
            return central;
        }

        if (v[central] > n) {
            return interno(v, n, desde, central - 1);
        } else {
            return interno(v, n, central + 1, hasta);
        }

    }

    public static int getBusquedaBinariaR(int[] v, int n) {
        Arrays.sort(v);
        return interno(v, n, 0, v.length - 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        final int MAX = 30;
        int[] v = new int[MAX];
        rellenarRandom(v);
        System.out.println(Arrays.toString(v));

        if (getBusquedaBinariaR(v, casos) == -1) {
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }

    }

}
