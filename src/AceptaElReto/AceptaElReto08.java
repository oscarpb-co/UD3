package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto08 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String numero;
//        while (in.hasNextLine()) {
//
//            numero = in.nextLine();
//            if (numero.replaceAll("^0+", "").replaceAll("0+$", "").equals(".")) {
//                System.out.println("0");
//
//            } else if (numero.replaceAll("0", "").equals("")) {
//
//                System.out.println("0");
//
//            } else if (numero.replaceAll("^0+", "").
//                    replaceAll("0+$", "").endsWith(".")) {
//
//                System.out.println(numero.replaceAll("^0+", "")
//                        .replaceAll("0+$", "")
//                        .replace(".", ""));
//
//            } else if (numero.replaceAll("^0+", "").
//                    replaceAll("0+$", "").startsWith(".")) {
//
//                System.out.println("0" + numero.replaceAll("^0+", "")
//                        .replaceAll("0+$", ""));
//
//            } else {
//                String sinSobras = numero.replaceAll("^0+", "");
//                System.out.println(sinSobras);
//            }
//
//        }

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String num = sc.nextLine();

            String entera;
            String decimal = "";

            if (num.contains(".")) {
                String[] partes = num.split("\\.");
                entera = partes[0];
                decimal = partes[1];
            } else {
                entera = num;
            }

            int i = 0;
            while (i < entera.length() - 1 && entera.charAt(i) == '0') {
                i++;
            }
            entera = entera.substring(i);

            if (!decimal.isEmpty()) {
                int j = decimal.length() - 1;
                while (j >= 0 && decimal.charAt(j) == '0') {
                    j--;
                }
                decimal = decimal.substring(0, j + 1);
            }

            if (decimal.isEmpty()) {
                System.out.println(entera);
            } else {
                System.out.println(entera + "." + decimal);
            }
        }
    }
}
