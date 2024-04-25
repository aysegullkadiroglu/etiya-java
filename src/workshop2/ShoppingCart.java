package workshop2;

// 3-) Kullanıcının seçtiği ürünleri, fiyatlarını ve
// sepete eklenen miktarları bir dizi ile tutan algoritma yazınız.

public class ShoppingCart {
    public static void main(String[] args) {

        String[][] shopping = new String[3][3];
        shopping[0][0] = "Çanta";
        shopping[0][1] = "50";
        shopping[0][2] = "10";

        shopping[1][0] = "Pantolon";
        shopping[1][1] = "400";
        shopping[1][2] = "4";

        shopping[2][0] = "T-shirt";
        shopping[2][1] = "100";
        shopping[2][2] = "2";

        for (int i = 0; i < shopping.length; i++){
            System.out.println("Sepet: " + shopping[i][0] + ", Fiyat: " + shopping[i][1] + ", Adet: " + shopping[i][2]);
        }
    }
}
