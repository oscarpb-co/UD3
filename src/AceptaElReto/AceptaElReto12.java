package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto12 {

    public static boolean esABCD(String palabra) {

        for (int i = 0; i < palabra.length() - 1; i++) {

            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false;
            }

        }

        return true;
    }

    public static int contadorABCD(String frase) {
        Scanner in = new Scanner(frase);
        int contador = 0;
        while (in.hasNext()) {
            if (esABCD(in.next())) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;

        while (!(frase = in.nextLine()).equals("ABCD")) {
            frase = frase.toLowerCase();
            System.out.println(contadorABCD(frase));

        }

    }

}
