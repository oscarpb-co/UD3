package ud4;

import java.util.Scanner;

public class AceptaElReto001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        int[] dientesAr = new int[6];
        int dientesAb;
        int altura;
        boolean encajan;
        for (int i = 0; i < casos; i++) {

            for (int j = 0; j < 6; j++) {
                dientesAr[j] = in.nextInt();
            }

            encajan = true;
            dientesAb = in.nextInt();
            altura = dientesAb + dientesAr[0];
            for (int k = 1; k < 6; k++) {
                if (in.nextInt() + dientesAr[k] != altura) {
                    encajan = false;
                    in.nextLine();
                    break;
                }

            }
            if (encajan) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }

}
