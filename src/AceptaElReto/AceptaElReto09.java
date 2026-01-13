package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int crecimiento = sc.nextInt();
            String oruga = sc.next();

            if (oruga.equals("C")) {
                break;
            }

            StringBuilder orugaSinCabeza = new StringBuilder(oruga.substring(0, oruga.length() - 1));

            for (int i = 0; i < crecimiento; i++) {
                StringBuilder orugaFinal = new StringBuilder();

                for (int j = 0; j < orugaSinCabeza.length(); j++) {
                    char c = orugaSinCabeza.charAt(j);
                    if (c == 'A') {
                        orugaFinal.append("AN");
                    } else if (c == 'N') {
                        orugaFinal.append("NA");
                    }
                }
                orugaSinCabeza = orugaFinal;
            }

            orugaSinCabeza.append('C');
            System.out.println(orugaSinCabeza);
        }
    }
}