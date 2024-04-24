package workshop1;

// 2- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.

/*
Do-While ve While döngüleri, Java ve diğer birçok programlama dilinde kullanılan döngü yapılarıdır.
Her ikisi de belirli bir koşul sağlandığı sürece tekrarlanan kod bloklarını ifade etmek için kullanılır
ancak farklı noktalarda kontrol sağlarlar.

While Döngüsü: While döngüsü, belirli bir koşul doğru olduğu sürece döngüyü tekrarlar.
Başlangıçta koşul doğru değilse, döngü hiçbir zaman çalışmayabilir.
*/

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
