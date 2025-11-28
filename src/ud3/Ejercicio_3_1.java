package ud3;

import java.util.Scanner;

public class Ejercicio_3_1 {

    private static boolean bisiesto(int año){
        return((año % 4 == 0) && 
                (año % 100 != 0 || año % 400 == 0));
        
    }
    private static int diasGet(int mes, int año){
        switch(mes){
            
            case 1, 3, 5, 7, 8, 10, 12:        
                return 31;    
            case 4, 6, 9, 11:   
                return 30;    
            default:
                return ((bisiesto(año))? 28 : 29);
        }        
    }
//    private static int indexOF(String cadena, char c){
//        for (int i = 0; i < cadena.length(); i++) {
//            if(cadena.charAt(i) == c)
//                return i;
//        }
//        return -1;        
//    }    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia;
        int mes;
        int año;
        String fecha;
        boolean fechaCorrecta = true;
        
        System.out.print("Fecha (dd/mm/aaaa): ");
        fecha = in.nextLine();
        dia = Integer.parseInt(fecha.substring(0, 2));
        mes = Integer.parseInt(fecha.substring(3, 5));
        año = Integer.parseInt(fecha.substring(6));


        
        if(mes < 1 || mes > 12 || año == 0 || dia < 1 || dia > diasGet(mes, año))
            fechaCorrecta = false;
          
        
        if(fechaCorrecta)
            System.out.println("Fecha correcta");
        else
            System.out.println("Fecha incorrecta");


    }

}