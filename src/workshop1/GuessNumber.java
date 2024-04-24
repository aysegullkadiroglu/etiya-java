package workshop1;

/*
3-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve
doğru tahmin edene kadar devam eden bir program yazınız.
(While döngüsü ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)
*/

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; // 1 ile 10 arasında rastgele sayı üretme

        System.out.println("Bir sayı tahmin edin (1 ile 10 arasında):");
        int guess = scanner.nextInt();

        while (guess != randomNumber) {
            System.out.println("Yanlış tahmin. Tekrar deneyin:");
            guess = scanner.nextInt();
        }

        System.out.println("Tebrikler! Doğru tahmin ettiniz. Sayı: " + randomNumber);

        scanner.close();
    }
}
