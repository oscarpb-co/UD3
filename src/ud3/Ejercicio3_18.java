package ud3;

import java.util.Scanner;

public class Ejercicio3_18 {

    private static boolean palindromo(String cadena) {

        if (cadena.length() == 0 || cadena.length() == 1) {
            return true;
        }

        if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1)) {
            return false;
        }

        return palindromo(cadena.substring(1, cadena.length() - 1));

    }
    
    private static boolean esPalindromo(String cadena){
        cadena = cadena.toLowerCase();
        cadena = cadena.replaceAll(" ", "");
        return palindromo(cadena);
    }
//    private static boolean getPalindromo(String cadena) {
//
//        StringBuilder sb = new StringBuilder(cadena);
//
//        String invertida = sb.reverse().toString();
//
//        if (cadena.equals(invertida)) {
//            return true;
//        }
//
//        return false;
//
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String c1 = in.nextLine();

        if (esPalindromo(c1)) {
            System.out.println("Si es");
        } else {
            System.out.println("No es");
        }

    }

}
