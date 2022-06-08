public class MeraJair_Ejercicio07 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int x = 100;
        int y = 100;
        int z = 0;
        while (a == b) {
            a += 3;
            while (x == y) {
                x += z;
            }
            b += 3;
        }
        System.out.println("El valor de x es igual a : " + x);
    }
}
