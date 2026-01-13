package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto05 {
    public static Scanner in = new Scanner(System.in);
    
    private static void resuelveElCaso() {
        
        String matricula;
        int numeroEdu;
        String matriculaEdu;
        int otroNumero;
        String otroMatricula;
        int contadorNuevo = 0;
        int contadorAntiguo = 0;
        int comparacion;

        matricula = in.next();
        matriculaEdu = matricula.substring(4);
        numeroEdu = Integer.parseInt(matricula.substring(0, 4));
        while (!(matricula = in.next()).equals("0")){
            otroMatricula = matricula.substring(4);
            otroNumero = Integer.parseInt(matricula.substring(0, 4));
            comparacion  = matriculaEdu.compareTo(otroMatricula);
            if (comparacion > 0) {
                contadorAntiguo++;
            }else if (comparacion < 0){
                contadorNuevo++;
            }else if (comparacion == 0) {
                if (numeroEdu > otroNumero){
                    contadorAntiguo++;
                }else{
                    contadorNuevo++;
                }
            }
        }
        System.out.println(contadorAntiguo + " " + contadorNuevo);
        
    }

    public static void main(String[] args) {
        
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            resuelveElCaso();
        }
    }

}
