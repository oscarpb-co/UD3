package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto04 {

    private static int persistenciaMult(int num) {
//        int contador = 0;
//
//        while (num >= 10) {
//            int volatil = 1;
//
//            while (num > 0) {
//                volatil *= (num % 10);
//                num /= 10;
//            }
//            num = volatil;
//            contador++;
//        }
//        return contador;
        
        if (num < 10) {
            return 1;
        }
        
        return 1 + persistenciaMult((num % 10) * persistenciaMult(num / 10));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println(persistenciaMult(in.nextInt()));
        }

    }

}
