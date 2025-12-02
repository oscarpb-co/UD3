package ud3;

import java.util.Scanner;

public class Ejercicio_3_03 {

    private static int esVocal(char letra) {
        if ((letra <= 'Z' && letra >= 'A') || (letra <= 'z' && letra >= 'a')){
            letra = Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                return 1;            
            }else{
                return 2;
            }    
        }
        return -1;
    }
    
    private static double porcentajeVocal(String texto, char c) {
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i++){ 
            if(texto.charAt(i) == c)
                contador++;
        }
        return (double)(contador * 100) / texto.length();
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
        String texto = in.nextLine();
        
        System.out.println("A: " + porcentajeVocal(texto, 'a'));
        System.out.println("E: " + porcentajeVocal(texto, 'e'));
        System.out.println("I: " + porcentajeVocal(texto, 'i'));
        System.out.println("O: " + porcentajeVocal(texto, 'o'));
        System.out.println("U: " + porcentajeVocal(texto, 'u'));
        
        
        
    }

}
