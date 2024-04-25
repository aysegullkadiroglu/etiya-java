package workshop2;

// 6-) Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini tutan bir Arraylist oluşturunuz.
// ArrayList içinde bulunan görevleri güncelleyen, tamamlanan görevleri ise silen algoritma yazınız.
// Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini tutan bir ArrayList oluşturun.


import java.util.ArrayList;
import java.util.List;

public class DailyTask {
    public static void main(String[] args) {

        List<String> todos = new ArrayList<>();
        List<Boolean> done = new ArrayList<>();

        // Görevleri ve tamamlanma durumlarını ekleyin
        todos.add("Homework");
        done.add(true);

        todos.add("Chores");
        done.add(false);

        todos.add("Gym");
        done.add(false);

        // Görevleri güncelleyen ve tamamlanan görevleri silen algoritma
        for (int i = 0; i < todos.size(); i++) {
            if (done.get(i)) {
                // Tamamlanan görevi sil
                todos.remove(i);
                done.remove(i);
                // Döngüde bir geriye gitme işlemi yaptığımız için indis değerini bir azaltıyoruz.
                i--;
            } else {
                // Görevi güncelle (örneğin, yeni bir görev adı atanabilir)
                String updatedTask = todos.get(i) + " - updated";
                todos.set(i, updatedTask);
            }
        }

        // Güncellenmiş görev listesini yazdırın
        System.out.println("Güncellenmiş görevler:");
        for (String task : todos) {
            System.out.println(task);
        }

    }
}