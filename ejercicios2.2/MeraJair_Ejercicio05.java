public class MeraJair_Ejercicio05 {
    public static void main(String[] args) {
        int x = 0;
        int y = 7;
        int z = -4;
        while (x > z) {
            if (y < 15) {
                y += 4;
                continue;
            }
            if (z < 0) {
                z += 2;
            } else {
                z += 1;
                x -= 1;
            }
            y += 3;
        }
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
}
