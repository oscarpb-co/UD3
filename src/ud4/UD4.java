package ud4;

public class UD4 {

    enum SEMAFORO {
        ROJO,
        AMBAR,
        VERDE
    }

    static SEMAFORO semaforo() {

        int color = (int) (Math.random() * 3);

        if (color == 0) {
            return SEMAFORO.VERDE;
        } else if (color == 1) {
            return SEMAFORO.AMBAR;
        } else {
            return SEMAFORO.ROJO;
        }

    }

    public static void main(String[] args) {
        int contadorV = 0;
        int contadorA = 0;
        int contadorR = 0;
        for (int i = 0; i < 120; i++) {
            SEMAFORO color = semaforo();

            if (color == SEMAFORO.VERDE){
                contadorV++;
            }else if (color == SEMAFORO.AMBAR){
                contadorA++;
            }else{
                contadorR++;
            }
        }
        System.out.println("Verde: " + contadorV);
        System.out.println("Ambar: " + contadorA);
        System.out.println("Rojo: " + contadorR);
    }

}
