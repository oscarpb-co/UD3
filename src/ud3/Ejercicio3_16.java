package ud3;

import java.util.Scanner;

public class Ejercicio3_16 {

    private static int getSuma (int num, int acumulado){
    
        if (num == 0)
            return acumulado;
        
        return getSuma(num / 10, acumulado += num % 10);
        
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nume = in.nextInt();

        System.out.println("La suma es: " + getSuma(nume, 0));
    }

}