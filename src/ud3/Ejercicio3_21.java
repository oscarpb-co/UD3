package ud3;

import java.util.Scanner;

public class Ejercicio3_21 {
    
    private static void getHanoi(int discos, int origen, int auxiliar, int destino){
        if (discos == 1){
            System.out.println("Mover disco de " + origen + " a " + destino);
            return;
        }
        getHanoi(discos - 1, origen, destino, auxiliar);
        System.out.println("Mover disco de " + origen + " a " + destino);
        getHanoi(discos - 1, auxiliar, origen, destino);
            
            
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int discos = in.nextInt();
        int origen = 1;
        int auxiliar = 2;
        int destino = 3;
        
        getHanoi(discos, origen, auxiliar, destino);
    }

}