package workshop1;

// 4- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }

        scanner.close();
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}

