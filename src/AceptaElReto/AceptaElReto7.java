package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int distanciaMax, desnivelMax;
        int distancia;
        int desnivel;
        int numJornadas;
        int sumaDistancia;
        int sumaDesnivel;
        boolean destituido = false;
        while (in.hasNext()) {
            numJornadas = 1;
            sumaDistancia = 0;
            sumaDesnivel = 0;
            distanciaMax = in.nextInt();
            desnivelMax = in.nextInt();

            distancia = in.nextInt();
            desnivel = in.nextInt();

            do {

                if (desnivel < 0) {
                    desnivel = 0;
                }

                if (distancia > distanciaMax || desnivel > desnivelMax) {
                    destituido = true;
                    in.nextLine();
                    break;
                }

                if ((sumaDistancia + distancia) <= distanciaMax
                        && (sumaDesnivel + desnivel) <= desnivelMax) {
                    sumaDistancia += distancia;
                    sumaDesnivel += desnivel;
                } else {
                    numJornadas++;
                    sumaDistancia = distancia;
                    sumaDesnivel = desnivel;
                }

                distancia = in.nextInt();
                desnivel = in.nextInt();
            } while (distancia != 0 || desnivel != 0);

            if (destituido) {
                System.out.println("DESTITUIDO");
            } else {
                System.out.println(numJornadas);
            }

        }

    }

}
