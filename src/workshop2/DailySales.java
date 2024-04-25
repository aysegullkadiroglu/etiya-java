package workshop2;

// 1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan,
// toplam satış gelirini hesaplayan bir algoritma yazınız.

public class DailySales {
    public static void main(String[] args) {

        int[] quantity = {5, 8, 1};
        String[] products = {"Telefon","Bilgisayar","Tablet"};
        double[] prices = {100, 500, 200};
        double totalIncome = 0;

        for(int i = 0 ; i< products.length; i++){
            totalIncome += prices[i] * quantity[i];
            System.out.println("Ürün adı " + products[i] + " Ürün miktarı " + quantity[i] + " Ürün fiyatı " + prices[i]);
        }
        System.out.println(totalIncome);
    }
}
