
// impresión de datos personales con regex
import java.util.Scanner;

public class regex_example_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;
        String lastname;
        String age;
        String number;
        String email;
        String id;

        // strings para el regex

        String name_regex = "^[a-zA-Z]{2,}$";
        String lastname_regex = "^[a-zA-Z]{2,}$";
        String age_regex = "^[0-9]{1,2}$";
        String number_regex = "^[0-9]{9,10}$";
        String email_regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        String id_regex = "^[0-9]{10}$";

        // entrada de datos personales

        System.out.println("Ingresa tu nombre: ");
        name = scan.nextLine();
        System.out.println("Ingresa tu apellido: ");
        lastname = scan.nextLine();
        System.out.println("Ingresa tu edad: ");
        age = scan.nextLine();
        System.out.println("Ingresa tu número de teléfono: ");
        number = scan.nextLine();
        System.out.println("Ingresa tu email: ");
        email = scan.nextLine();
        System.out.println("Ingresa tu ID: ");
        id = scan.nextLine();

        scan.close();

        // impresión de datos personales con regex

        if (name.matches(name_regex)) {
            System.out.println("Nombre: " + name);
        } else {
            System.out.println("Nombre inválido");
        }

        if (lastname.matches(lastname_regex)) {
            System.out.println("Apellido: " + lastname);
        } else {
            System.out.println("Apellido inválido");
        }

        if (age.matches(age_regex)) {
            System.out.println("Edad: " + age);
        } else {
            System.out.println("Edad inválida");
        }

        if (number.matches(number_regex)) {
            System.out.println("Número de teléfono: " + number);
        } else {
            System.out.println("Número de teléfono inválido");
        }

        if (email.matches(email_regex)) {
            System.out.println("Email: " + email);
        } else {
            System.out.println("Email inválido");
        }

        if (id.matches(id_regex)) {
            System.out.println("ID: " + id);
        } else {
            System.out.println("ID inválido");
        }

    }
}
