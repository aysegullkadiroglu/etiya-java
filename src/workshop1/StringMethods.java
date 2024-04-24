package workshop1;

// 5- String metotlarını araştırınız. Her bir metot için örnek yapınız.

public class StringMethods {
    public static void main(String[] args) {

        // length() Metodu: Bir String'in uzunluğunu (karakter sayısını) döndürür.
        String str = "Merhaba Dünya";
        int length = str.length();
        System.out.println("String uzunluğu: " + length); // Çıktı: 13

        // charAt() Metodu: Belirli bir indeksteki karakteri döndürür.
        String string1 = "Merhaba";
        char ch = string1.charAt(2);
        System.out.println("İkinci karakter: " + ch); // Çıktı: r

        // toUpperCase() ve toLowerCase() Metotları: String'i büyük veya küçük harfe dönüştürür.
        String string2 = "Merhaba";
        String upperCaseStr = string2.toUpperCase();
        String lowerCaseStr = string2.toLowerCase();
        System.out.println("Büyük harf: " + upperCaseStr); // Çıktı: MERHABA
        System.out.println("Küçük harf: " + lowerCaseStr); // Çıktı: merhaba

        // substring() Metodu: Belirli bir alt dizesini alır.
        String string3 = "Merhaba Dünya";
        String subStr = string3.substring(3, 8);
        System.out.println("Alt dize: " + subStr); // Çıktı: haba

        // equals() Metodu: İki String'in eşit olup olmadığını kontrol eder.
        String str1 = "Merhaba";
        String str2 = "Merhaba";
        boolean isEqual = str1.equals(str2);
        System.out.println("Eşit mi? " + isEqual); // Çıktı: true

        // indexOf() ve lastIndexOf() Metotları: Belirli bir karakterin veya alt dizenin dizindeki
        // ilk ve son indeksini bulur.
        String string4 = "Merhaba Dünya";
        int firstIndex = string4.indexOf('a');
        int lastIndex = string4.lastIndexOf('a');
        System.out.println("İlk 'a' indeksi: " + firstIndex); // Çıktı: 3
        System.out.println("Son 'a' indeksi: " + lastIndex); // Çıktı: 10

        // startsWith() ve endsWith() Metotları: Belirli bir önek veya
        // sonek ile başlayıp başlamadığını veya bitip bitmediğini kontrol eder.
        String string5 = "Merhaba Dünya";
        boolean startsWith = string5.startsWith("Mer");
        boolean endsWith = string5.endsWith("nya");
        System.out.println("Ön ek 'Mer' ile başlar mı? " + startsWith); // Çıktı: true
        System.out.println("Sondan ek 'nya' ile biter mi? " + endsWith); // Çıktı: true

        // trim() Metodu: String'in başındaki ve sonundaki boşlukları kaldırır.
        String string6 = "   Merhaba Dünya   ";
        String trimmedStr = string6.trim();
        System.out.println("Kırpılmış String: '" + trimmedStr + "'"); // Çıktı: 'Merhaba Dünya'

    }
}
