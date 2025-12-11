package ud3;

import java.util.Scanner;

public class Ejercicio_3_08 {
    private static int longitud (int n) {
        int longitud = 0;
        if (n == 0)
            return 1;
        
        while (n != 0) {
            n /= 10;
            longitud++;
        }
        return longitud;
    }
    
    private static int alReves (int n) {
        int unidades;
        int nuevo = 0;
        
        while (n != 0){
            unidades = n % 10;
            nuevo = nuevo * 10 + unidades;
            n /= 10;
        }
       return nuevo; 
                
    }
    
    private static boolean esReversible(int n){
        int suma;
        if (longitud(alReves(n)) == longitud(n)){
            suma = alReves(n) + n;
            int unidadeSuma;
            while (suma != 0){
                unidadeSuma = suma % 10;
                if ((unidadeSuma % 2) == 0)
                    return false;
                suma /= 10;
            }
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int contador = 0;
        int n = 1;
        while (contador < max){
            if(esReversible(n)){
                contador++;
                System.out.println(n);
            }
            n++;
        }
        
    }

}