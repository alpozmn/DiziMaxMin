import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 13, 17, 22}; // Örnek olarak bir dizi tanımladık
        int targetNumber = 12; // Girilen sayı

        Arrays.sort(numbers); // Diziyi sıralıyoruz

        int smaller = -1; // Girilen sayıdan küçük en yakın sayı
        int larger = -1; // Girilen sayıdan büyük en yakın sayı

        // Girilen sayıdan küçük en yakın sayıyı bulma
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < targetNumber) {
                smaller = numbers[i];
            } else {
                break;
            }
        }

        // Girilen sayıdan büyük en yakın sayıyı bulma
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > targetNumber) {
                larger = numbers[i];
            } else {
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
    }
}
