import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int num = inp.nextInt();

        recursiveIslem(sayi);
    }

    // Recursive olarak işlem yapma metodu
    public static void recursiveIslem(int sayi) {
        if (sayi <= 0) {
            System.out.println("Son Değer: " + sayi);
            // Eğer sayı 0 veya negatifse işlemi sonlandır
            return;
        } else {
            // Her çıkarma işlemi sırasında sayıyı ekrana yazdır
            System.out.println("Çıkarma Sonucu: " + sayi);
            recursiveIslem(sayi - 5);

            // Her ekleme işlemi sırasında sayıyı ekrana yazdır
            System.out.println("Toplama Sonucu: " + sayi);
            recursiveIslem(sayi + 5);
        }
    }
}