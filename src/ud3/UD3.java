package ud3;

public class UD3 {

//    private static void tabla(int n) {
//        System.out.println("Tabla del " + n);
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * "+ i + " = " + n * i);
//        }
//    }
    private static void a() {
        System.out.println("a");
        b();
    }
    private static void b() {
        System.out.println("b");
        c();
    }
    private static void c() {
        System.out.println("c");
    }
    
    
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            tabla(i);
//        }
            a();
            System.out.println("Main");
    }

}

