package workshop1;

// 2- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.

/*
Do-While ve While döngüleri, Java ve diğer birçok programlama dilinde kullanılan döngü yapılarıdır.
Her ikisi de belirli bir koşul sağlandığı sürece tekrarlanan kod bloklarını ifade etmek için kullanılır
ancak farklı noktalarda kontrol sağlarlar.

Do-While Döngüsü: Do-While döngüsü, döngünün içindeki kod bloğunu en az bir kez çalıştırır, ardından koşulu kontrol eder.
Koşul doğru olduğu sürece döngü devam eder, yanlış olduğunda ise durur.
*/

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);
    }
}
