package ud3;

import java.util.Scanner;

public class Ejercicio_3_02 {

    private static int tipotriangulo(int lado1, int lado2, int lado3) {
        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2
                && (lado2 + lado3) > lado1) {
            if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                return 3; //Tipo: triangulo escaoeno
            } else if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                return 1; //Tipo: tirangulo equilatero
            } else {
                return 2; //Tipo: triangulo isosceles
            }
        } else {
            return 0; //Tipo: no es un triangulo
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lado1 = in.nextInt();
        int lado2 = in.nextInt();
        int lado3 = in.nextInt();

        if (tipotriangulo(lado1, lado2, lado3) == 0) {
            System.out.println("No es un triangulo");
        } else if (tipotriangulo(lado1, lado2, lado3) == 1) {
            System.out.println("Es un triangulo equilatero");
        } else if (tipotriangulo(lado1, lado2, lado3) == 2) {
            System.out.println("Es un triangulo isosceles");
        } else if (tipotriangulo(lado1, lado2, lado3) == 3) {
            System.out.println("Es un triangulo escaleno");
        }

    }

}
