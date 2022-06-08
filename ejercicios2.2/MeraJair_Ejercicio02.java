public class MeraJair_Ejercicio02 {
    public static void main(String[] args) {
        int count_pair = 0;
        int numbers[] = { 2, 4, 5, 1, 9, 17, 25, 27, 16, 30, 11 };
        for (int i = 0; i < 11; i++) {
            if (numbers[i] % 2 == 0) {
                count_pair++;
            }
        }
        System.out.println("Hay " + count_pair + " números pares.");
    }
}
