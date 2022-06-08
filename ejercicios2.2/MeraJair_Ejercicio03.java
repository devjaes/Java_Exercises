public class MeraJair_Ejercicio03 {
    public static void main(String[] args) {
        int numbers[] = { 2, 5, 9, 3, -1, 4 };
        int add = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                add = add + numbers[i];
            }
        }
        System.out.println("La suma es: " + add);
    }
}
