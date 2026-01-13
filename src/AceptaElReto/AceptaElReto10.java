package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numero;
        int contador;
        int contadorFoV;
        while (in.hasNext()) {
            contadorFoV = 0;
            contador = 0;
            numero = in.nextLong();
            if (numero == 0) {
                System.out.println("NO POLIDIVISIBLE");
                continue;
            }
            long numeroReal = numero;
            while (numero != 0) {
                numero /= 10;
                contador++;
            }

            for (int i = 0; i < contador; i++) {

                if ((numeroReal % (contador - i)) == 0) {
                    numeroReal /= 10;
                } else {
                    contadorFoV++;
                    break;
                }

            }
            if (contadorFoV > 0) {
                System.out.println("NO POLIDIVISIBLE");
            } else {
                System.out.println("POLIDIVISIBLE");
            }

        }

    }

}