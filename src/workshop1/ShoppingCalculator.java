package workshop1;

/*
1- kullanıcıdan kaç ürün almak istediğini soran,
her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
(Input için Scanner ve döngü için for döngüsü kullanınız)
*/

import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products do you want to buy? ");
        int numberOfProducts = scanner.nextInt();

        double totalAmount = 0;

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.print("Enter the price of product " + i + ": ");
            double price = scanner.nextDouble();
            totalAmount += price;
        }

        System.out.println("Total shopping amount: " + totalAmount);

        scanner.close();
    }
}
