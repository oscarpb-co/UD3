package ud3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Random;

public class prueba2 {

    public static void main(String[] args) {
//        int cierto = 0, falso = 0;
//        
//        Random aleatorio = new Random();
//        for (int i = 0; i < 1000000; i++) {
//            
//            if (aleatorio.nextBoolean())
//                cierto++;
//            else
//                falso++;
//        }
//        System.out.println(cierto);
//        System.out.println(falso);


//        System.out.println("Fecha actual " + LocalDate.now());
//        System.out.println("Hora actual " + LocalTime.now());
//        System.out.println("Hora actual " + LocalDateTime.now());
//        System.out.println("Fecha cumpleaños " + LocalDate.of(2006, Month.JUNE, 20));
//        LocalDate fecha = LocalDate.now();
//        int dia = fecha.getDayOfMonth();
//        int mes = fecha.getMonthValue();
//        int año = fecha.getYear();
        LocalDateTime fecha = LocalDateTime.now();       
        DateTimeFormatter dateFormatter =
                DateTimeFormatter
                        .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
//                        .withLocale(new Locale("es", "ES"));
                        .withLocale(Locale.ENGLISH);
        System.out.println(fecha.format(dateFormatter));

    }
    

}