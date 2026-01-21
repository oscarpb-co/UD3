package ud4;

import java.util.Arrays;
import java.util.Scanner;

public class AceptaElReto004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos;
        String palabra1;
        String palabra2;
        char[] array1, array2;
        casos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < casos; i++) {

            palabra1 = in.next();
            palabra2 = in.next();

            array1 = palabra1.toCharArray();
            array2 = palabra2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if (java.util.Arrays.equals(array1, array2)) {
                System.out.println("GANA");
            } else {
                System.out.println("PIERDE");
            }

        }

    }

}
