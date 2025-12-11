package ud3;

import java.util.Scanner;

public class Ejercicio3_20 {

    private static void getEscalera(int n) {
//        int n = 1;
//
//        if (n == max) {
//            return n;
//        }
//
//        return getEscalera(n++);
        if (n == 0) {
            return;
        }

        getEscalera(n - 1);

        getFilas(n);
        System.out.println();
    }

    private static void getFilas(int n) {
        if (n == 0) {
            return;
        }

        getFilas(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Valor de n: ");
        int n = in.nextInt();

        getEscalera(n);

    }

}
