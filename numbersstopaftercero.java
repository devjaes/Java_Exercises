import java.util.Scanner;

public class numbersstopaftercero {
    public static void main(String[] args) {
        int number = 0;
        double average = 0;
        double add = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Para terminar ingresa el número 0");

        do {
            try {
                System.out.println("Ingresa un número: ");
                number = scan.nextInt();
                add += number;
                count++;

            } catch (Exception e) {

                System.out.println("Error, ingresa un número entero");
                continue;
            }

        } while (number != 0);

        scan.close();
        
        average = (double) (add / count);
        System.out.println("El promedio es: " + average);
    }
}