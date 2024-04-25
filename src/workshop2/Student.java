package workshop2;

import java.util.ArrayList;
import java.util.List;

// 5-) Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak
// belirli not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.

public class Student {
    public static void main(String[] args) {

        List<String> studentNames = new ArrayList<>();
        List<Integer> studentGrades = new ArrayList<>();

        studentNames.add("Melodi Bayraktar");
        studentGrades.add(85);

        studentNames.add("Burak Balıkçı");
        studentGrades.add(45);

        studentNames.add("Ayşegül Kadiroğlu");
        studentGrades.add(35);


        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i) < 50) {
                studentGrades.remove(i);
                studentNames.remove(i);
                System.out.println("Öğrenci silindi.");
                i--;
            }
        }

        System.out.println("Kalan öğrenciler:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
        }
    }
}