package ud3;

import java.util.Scanner;

public class Ejercicio3_15 {

    private static int getReversaInterno(int num, int acumular) {
        if (num == 0) {
            return acumular;
        }

        return getReversaInterno(num / 10, acumular * 10 + num % 10);

    }

    private static int getReversa(int num) {
        return getReversaInterno(num, 0);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nume = in.nextInt();

        System.out.println("En reversa es: " + getReversa(nume));

    }

}
