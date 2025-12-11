package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int anoSir;
        int numObras;
        int anoObra;
        String titulo;
        int minAno;
        String minObra = "";
        int contador;
        while (in.hasNext()) {
            anoSir = in.nextInt();
            in.nextLine();
            numObras = in.nextInt();
            minAno = Integer.MAX_VALUE;
            contador = 0;
            for (int i = 0; i < numObras; i++) {
                anoObra = in.nextInt();
                titulo = in.nextLine();

                if (anoSir <= anoObra) {
                    contador++;
                    if (anoObra < minAno) {
                        minAno = anoObra;
                        minObra = titulo;
                    }
                }
            }
            if (contador == numObras) {
                System.out.println("TODAS");
            } else if (contador == 0) {
                System.out.println("NINGUNA");
            } else {
                System.out.println(minObra.trim());
            }
        }

    }

}
