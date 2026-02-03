package ud4;

import java.text.NumberFormat;
import java.util.Arrays;

public class Ejercicio13Redux {

    /**
     * Comprueba si v tiene valores en el rango correcto no tiene elementos
     * repetidos
     *
     * @param v vector de datos
     * @return
     */
    static boolean esValido(int[] v) {
        boolean[] apariciones = new boolean[50];

        for (int i = 0; i < v.length; i++) {
            if (v[i] < 1 || v[i] > 49) {
                return false;
            }

            if (apariciones[v[i]]) {
                return false;
            }

            apariciones[v[i]] = true;
        }
        return true;
    }

    /**
     * Comprobamos que si el número n ya está en el vector.
     *
     * @param n número que se quiere comprobar
     * @param v vector con los números ya generados
     * @param i número de números generados previamente
     * @return booleano indicando si el número está en el vector.
     */
    static boolean estaRepetido(int n, int[] v, int i) {
        for (int j = 0; j <= i; j++) {
            if (v[j] == n) {
                return true;
            }
        }
        return false;
    }

    static int[] generarBoleto() {
        // Crear vector
        int[] v = new int[6];
        int n;

        // Rellenarlo
        for (int i = 0; i < v.length; i++) {
            do {
                n = (int) (Math.random() * 49 + 1);
            } while (estaRepetido(n, v, i - 1));
            v[i] = n;
        }

        // Devolverlo
        return v;
    }

    public static boolean esta(int[] v, int n) {
        for (int i = 0; i < v.length && n >= v[i]; i++) {
            if (v[i] == n) {
                return true;
            }
        }
        return false;

    }

    public static int getAciertos(int[] boletoWin, int[] boleto) {
        int contador = 0;
        for (int i = 0; i < boleto.length; i++) {
            if (esta(boletoWin, boleto[i])) {
                contador++;
            }
        }
        return contador;

    }

    public static void main(String[] args) {
        final int MAX = 100_000_000;
        int[] ganador = generarBoleto();
        Arrays.sort(ganador);
        int[] boleto;
        int[] aciertos = new int[7];

        for (int i = 0; i < MAX; i++) {
            boleto = generarBoleto();
            aciertos[getAciertos(ganador, boleto)]++;

        }
        
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nfP = NumberFormat.getPercentInstance();
        nfP.setMinimumFractionDigits(6);
        
        for (int i = 0; i < aciertos.length; i++) {
            System.out.println(i + ": " + nf.format(aciertos[i])
                                + " " +
                                nfP.format((double)aciertos[i] / MAX));
        }
    }
}
