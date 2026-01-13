package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto03 {

    private static String acronimo(String entrada) {
        Scanner in = new Scanner(entrada);
        char inicial;
        String acronimo = "";
        while (in.hasNext()) {
            inicial = in.next().charAt(0);

            if (Character.isUpperCase(inicial)) {
                acronimo += inicial;
            }

        }
        return acronimo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine();
        while (casos-- > 0) {
            System.out.println(acronimo(in.nextLine()));

        }

    }

}
