public class MeraJair_Ejercicio08 {
    public static void main(String[] args) {
        int a = 60;
        int b = 0;
        int x = 100;
        int y = 100;
        int z = 100;
        while (a != b) {
            a += 10;
            while (x == y) {
                x += z;
            }
            b += 20;
            a -= 10;
            y = x;
        }
        System.out.println("El valor de z es igual a : " + z);
    }
}
