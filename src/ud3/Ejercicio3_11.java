package ud3;

public class Ejercicio3_11 {

    private static boolean esPerfecto (int n){
        int suma = 0;
                
        for (int i = 1; i < n; i++) {
            if(n % i == 0)
                suma += i;
        }
        return suma == n;
    }
    
    public static void main(String[] args) {
        final int MAX = 4;
        int n = 1;
        int contador = 0;
        while (contador < MAX){
            if(esPerfecto(n)){
                contador++;
                System.out.println(n);
            }  
            n++;
        }
         
    }

}