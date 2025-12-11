package ud3;

import java.util.Scanner;

public class Ejercicio3_17 {

    private static int getMCD(int m, int n) {

        if (n <= m && (m % n) == 0) {
            return n;
        } else if (m < n) {
            return getMCD(n, m);
        } else {
            return getMCD(n, (m % n));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int m = in.nextInt();
        System.out.println("Dime el segundo numero");
        int n = in.nextInt();

        System.out.println("El minimo comun divisor es: " + getMCD(m, n));
    }

}
