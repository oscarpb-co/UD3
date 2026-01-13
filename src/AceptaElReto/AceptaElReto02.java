package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombreNieto;
        int casos = in.nextInt();
        int casosNietos;
        String intentosAbuela;

        for (int i = 0; i < casos; i++) {
            nombreNieto = in.next();
            casosNietos = in.nextInt();
            int contador = 1;
            for (int j = 1; j <= casosNietos; j++) {
                intentosAbuela = in.next();

                if (casosNietos == 1 && intentosAbuela.equals(nombreNieto)) {
                    System.out.println("FALSA");
                    in.nextLine();
                    break;

                } else if (contador != casosNietos && intentosAbuela.equals(nombreNieto)) {
                    System.out.println("FALSA");
                    in.nextLine();
                    break;

                } else if (contador == casosNietos && intentosAbuela.equals(nombreNieto)) {
                    System.out.println("VERDADERA");
                } else if (!(intentosAbuela.equals(casosNietos)) && contador == casosNietos) {
                    System.out.println("FALSA");
                } else {
                    contador++;
                }
            }

        }
    }

}
