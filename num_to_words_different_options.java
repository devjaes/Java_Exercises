import java.util.Scanner;

public class num_to_words_different_options {
    public static void main(String[] args) {
        int num = 0;
        String units[] = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        String tens[] = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa" };
        String special_ten[] = { "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho",
                "diecinueve" };

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        num = scan.nextInt();
        String num_S = String.valueOf(num);
        scan.close();
        if (num_S.length() == 1) {
            System.out.println("El número" + num + "en palabras es: " + units[num_S.charAt(0) - '0']);
        } else if (num_S.length() == 2) {
            if (num_S.charAt(1) == '0') {
                System.out.println("El número" + num + "en palabras es: " + tens[num_S.charAt(0) - '0' - 1]);
            } else if (num_S.charAt(0) == '1' && num_S.charAt(1) != '0') {
                System.out.println("El número" + num + "en palabras es: " + special_ten[num_S.charAt(1) - '0' - 1]);
            } else {
                System.out.println("El número" + num + "en palabras es: " + tens[num_S.charAt(0) - '0' - 1] + " y "
                        + units[num_S.charAt(1) - '0']);
            }
        } else if (num_S.length() == 3) {
            System.out.println("El número es cien");
        }
        /*
         * for (int i = 0; i < 10; i++) {
         * if (num_S.equals(String.valueOf(i))) {
         * System.out.println("El número" + num + "en palabras es: " + units[i]);
         * continue;
         * }
         * if (num_S.length() == 2) {
         * 
         * if (num_S.charAt(1) == 0 && num_S.charAt(0) == i) {
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(i) - '0']);
         * 
         * } else if (num_S.charAt(0) - '0' == 1 && num_S.charAt(1) - '0' != 0 &&
         * num_S.charAt(0) == i+1) {
         * System.out.println("El número" + num + "en palabras es: " +
         * special_ten[num_S.charAt(i) - '0']);
         * 
         * } else if (num_S.equals(String.valueOf(i + 20))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 30))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 40))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 50))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 60))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 70))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 80))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * } else if (num_S.equals(String.valueOf(i + 90))) {
         * System.out.println("El número" + num + "en palabras es: " + tens[i] + " y " +
         * units[i]);
         * 
         * }
         * continue;
         * 
         * }
         * 
         * if (num_S.length() == 3) {
         * System.out.println("El número" + num + "en palabras es: " + hundred);
         * continue;
         * }
         * 
         * /*
         * switch (num_S.length()) {
         * case 1:
         * System.out.println(units[num_S.charAt(0) - '0']);
         * break;
         * case 2:
         * if (num_S.charAt(1) == 0) {
         * switch (num_S.charAt(0)) {
         * case '1':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(0) - '0']);
         * break;
         * case '2':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(1) - '0']);
         * break;
         * case '3':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(2) - '0']);
         * break;
         * case '4':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(3) - '0']);
         * break;
         * case '5':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(4) - '0']);
         * break;
         * case '6':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(5) - '0']);
         * break;
         * case '7':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(6) - '0']);
         * break;
         * case '8':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(7) - '0']);
         * break;
         * case '9':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(8) - '0']);
         * break;
         * }
         * } else if (num_S.charAt(0) == '1' && num_S.charAt(1) != '0') {
         * 
         * switch (num_S.charAt(1)) {
         * case '1':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(0) - '0']);
         * break;
         * case '2':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(1) - '0']);
         * break;
         * case '3':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(2) - '0']);
         * break;
         * case '4':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(3) - '0']);
         * break;
         * case '5':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(4) - '0']);
         * break;
         * case '6':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(5) - '0']);
         * break;
         * case '7':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(6) - '0']);
         * break;
         * case '8':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(7) - '0']);
         * break;
         * case '9':
         * System.out.println(
         * "El número" + num + "en palabras es: " + special_ten[num_S.charAt(8) - '0']);
         * break;
         * }
         * } else {
         * 
         * switch (num_S.charAt(0)) {
         * case '2':
         * System.out.println("El número" + num + "en palabras es: " +
         * tens[num_S.charAt(1) - '0']);
         * break;
         * case '3':
         * System.out.println("El número" + num + "en palabras es: " + "CIEN");
         * break;
         * }
         * 
         * }
         * 
         * }
         */
    }
}
