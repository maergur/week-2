import java.util.Scanner;

public class Main {
    /*
    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen
    sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
    son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar
    5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = scanner.nextInt();

        recursive(n);
    }

    public static void recursive(int n) {
        if (n <= 0) {
            System.out.println(n + " ");
            return;
        }

        /* Bunu yazmam saatlerimi aldı aslında ama çözüm yoyo mantığı gibi.

        Method kendi içinde loop'a girerek girilen sayıdan 0 veya negatife gidiyor.

        Ancak o noktada return'e düştüğü için bu sefer kendini yoyo gibi başa sarıyor.
a
        Umarım açıklayacı olmuştur :)
         */

        System.out.println(n +  " ");
        recursive(n - 5);
        System.out.println(n + "");
    }
}