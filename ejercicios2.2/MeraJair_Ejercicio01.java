import java.util.Scanner;

public class MeraJair_Ejercicio01 {
    public static void main(String[] args) {
        int add = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hasta que número quieres sumar?");
        int num = scan.nextInt();
        scan.close();
        for (int i = 1; i <= num; i++) {
            add = add + i;
        }
        System.out.println("La suma de los números del 1 al " + num + " es: " + add);
    }
}