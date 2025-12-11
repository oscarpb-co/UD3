package ud3;

import java.util.Scanner;

public class Ejercicio3_12 {
    
    private static int getLongitud(int num){
        if (num <= 9 && num >= -9)
            return 1;
        else{
            return 1 + getLongitud(num / 10);
        }

    }
      
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        System.out.println("Su longitud es: " + getLongitud(num));
        
    }

}