package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto06 {

   private static boolean esGalo (String nombre){
       return nombre.endsWith("IX");
   }
   private static boolean esRomano (String nombre){
       return nombre.endsWith("US") || nombre.endsWith("UM");
   }
   private static boolean esGodo (String nombre){
       return nombre.endsWith("IC");
   }
   private static boolean esGriego (String nombre){
       return nombre.endsWith("AS");
   }
   private static boolean esNormando (String nombre){
       return nombre.endsWith("AF");
   }
   private static boolean esBreton (String nombre){
       return nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX");
   }
   private static boolean esHispano (String nombre){
       return nombre.endsWith("EZ");
   }
   private static boolean esIndio (String nombre){
       return nombre.endsWith("A");
   }
   private static boolean esPicto (String nombre){
       return nombre.startsWith("MAC");
   }
//    private static String queEs (String nombre){
//        
//        
//        
//        
//        
//        
//        
//    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        
        for (int i = 0; i < casos; i++) {
            
        }
        
        
    }

}