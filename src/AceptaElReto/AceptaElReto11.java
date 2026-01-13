package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long alto;
        long ancho;
        long suma;
        long maximo;
        long minimo;
        long diferencia;
        while ((alto = in.nextInt()) != 0 && (ancho = in.nextInt()) != 0) {

            suma = 0;
            maximo = Math.max(alto, ancho);
            minimo = Math.min(alto, ancho);
            while (maximo >= 10 && minimo >= 10) {

                suma += maximo / minimo;
                diferencia = maximo % minimo;
                maximo = minimo;
                minimo = diferencia;

            }
            System.out.println(suma);
        }

    }

}