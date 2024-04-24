package workshop1;

/*
6- Kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı, öğrenci soyadı,
1.sınav notu, 2.sınav notu, 3.sınav notu isteyen ve
daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
*/

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç öğrenci var? ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Öğrenci " + i + " bilgilerini girin:");

            System.out.print("Adı: ");
            String firstName = scanner.next();

            System.out.print("Soyadı: ");
            String lastName = scanner.next();

            System.out.print("1. Sınav Notu: ");
            double exam1 = scanner.nextDouble();

            System.out.print("2. Sınav Notu: ");
            double exam2 = scanner.nextDouble();

            System.out.print("3. Sınav Notu: ");
            double exam3 = scanner.nextDouble();

            double average = (exam1 + exam2 + exam3) / 3;
            System.out.println(firstName + " " + lastName + " Ortalama: " + average);
        }

        scanner.close();
    }
}
