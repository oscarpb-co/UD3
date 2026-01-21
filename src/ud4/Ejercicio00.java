package ud4;

import java.util.Scanner;

public class Ejercicio00 {

    public static String getNumBinario(int num) {

        if (num < 2) {
            return String.valueOf(num);
        }

        return getNumBinario(num / 2) + (num % 2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        num = in.nextInt();

        System.out.println(getNumBinario(num));

    }

}
