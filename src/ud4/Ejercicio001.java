package ud4;

public class Ejercicio001 {

    static int getSuspensos(int[] notas) {
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 4) {
                suspensos++;
            }
        }
        return suspensos;

    }

    static int getHacenMedia(int[] notas) {
        int hacen = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 4) {
                hacen++;
            }
        }
        return hacen;

    }

    static int getAprobados(int[] notas) {
        int aprobado = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobado++;
            }
        }
        return aprobado;

    }

    public static void main(String[] args) {
        int[] notas = new int[31];
        int suma = 0;
        int moda = 0;
        int maxOcurrencias = 0;
        int masAlta = 0;
        int masBaja = Integer.MAX_VALUE;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = (double) suma / notas.length;

        for (int i = 0; i < notas.length; i++) {
            System.out.print(i + ": " + notas[i] + ". ");
        }

        for (int i = 0; i < notas.length; i++) {
            int contador = 0;
            for (int j = 0; j < notas.length; j++) {
                if (notas[i] == notas[j]) {
                    contador++;
                }
            }
            if (contador > maxOcurrencias) {
                maxOcurrencias = contador;
                moda = notas[i];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > masAlta) {
                masAlta = notas[i];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < masBaja) {
                masBaja = notas[i];
            }
        }

        System.out.println();
        System.out.println("Suspensos [1,4): " + getSuspensos(notas));
        System.out.println("Hacen media [4,5): " + getHacenMedia(notas));
        System.out.println("Aprobados[5,10]:  " + getAprobados(notas));

        System.out.printf("Nota media: %.2f\n", media);
        System.out.println("Nota mas alta: " + masAlta);
        System.out.println("Nota nas baja: " + masBaja);
        System.out.println("Moda: " + moda);
        System.out.println("Moda ocurrencias: " + maxOcurrencias);
    }

}
