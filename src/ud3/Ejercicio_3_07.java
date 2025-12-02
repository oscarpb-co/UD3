package ud3;

import java.util.Scanner;

public class Ejercicio_3_07 {

    private static boolean horaCorrecta(int hora, int min, int sec) {
        return hora >= 0 && hora <= 23
                && min >= 0 && min <= 59
                && sec >= 0 && sec <= 59;
    }

    private static boolean horaCorrecta(String tiempo) {

        int hora = Integer.parseInt(tiempo.substring(0, 2));
        int min = Integer.parseInt(tiempo.substring(3, 5));
        int sec = Integer.parseInt(tiempo.substring(6));

        return horaCorrecta(hora, min, sec);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tiempo;
        while (!(tiempo = in.nextLine()).equals("0")){
        System.out.println("Es correcta?: " + horaCorrecta(tiempo));
        }
    }

}
