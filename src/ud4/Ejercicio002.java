package ud4;

import java.util.Scanner;

public class Ejercicio002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dado = new int[7];

        int MAX = 1000000;

        for (int i = 0; i < MAX; i++) {
            dado[(int) ((Math.random() * 6) + 1)]++;

        }

        for (int i = 1; i < 7; i++) {
            System.out.println(i + ": " + dado[i]);
        }

        for (int i = 1; i < 7; i++) {
            System.out.println(i + ": " + (double) ((dado[i] * 100.0) / MAX));
        }
    }

}
