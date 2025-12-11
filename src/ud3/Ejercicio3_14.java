package ud3;

import java.util.Scanner;

public class Ejercicio3_14 {
    
    private static int getAureo (int num) {
        if (num == 0 || num == 1)
            return 1;
        
        return getAureo(num - 1) + getAureo(num - 2);
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        for (int i = 0; i < num; i++) 
            System.out.print(getAureo(i) + " ");
        
        
        
    }

}