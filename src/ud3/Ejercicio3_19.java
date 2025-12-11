package ud3;

import java.util.Scanner;

public class Ejercicio3_19 {

    private static boolean palindromo(String cadena) {

        if (cadena.length() == 0 || cadena.length() == 1) {
            return true;
        }

        if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1)) {
            return false;
        }

        return palindromo(cadena.substring(1, cadena.length() - 1));

    }
    private static boolean esCapicua(int n){
        return palindromo(String.valueOf(n));
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        if(esCapicua(n))
            System.out.println("SI es capicua");
        else
            System.out.println("NO es capicua");
    }

}
