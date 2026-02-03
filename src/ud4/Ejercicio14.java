package ud4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

    public static int[] rellenar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        return numeros;

    }

    public static int[] barajar(int[] numeros) {
        int n;
        int temp;
        for (int i = 0; i < numeros.length; i++) {
            n = (int) (Math.random()) * numeros.length;

            temp = numeros[i];
            numeros[i] = numeros[n];
            numeros[n] = temp;

        }

        return numeros;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        int[] numeros = new int[casos];

        rellenar(numeros);
        System.out.println("Este es el vector sin barajar: "
                + Arrays.toString(numeros));

        for (int i = 0; i < (Math.random() * casos + 1); i++) {

            barajar(numeros);

        }
        System.out.println("Este es el vector barajado: "
                + Arrays.toString(numeros));
    }

}
