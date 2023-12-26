import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        /* Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
         */

        System.out.print("Lütfen oluşturmak istediğiniz dizinin boyutunu giriniz: ");
        Scanner inp = new Scanner(System.in);
        int arrayRow = inp.nextInt();

        // Dizinin içerisine koymak istediğimiz sayıları kullanıcan istiyoruz.

        int[] list = new int[arrayRow];
        for (int i = 0; i < arrayRow; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            list[i] = inp.nextInt();
        }

        // Rastgele girilen elemanları sıraya diziyoruz.

        Arrays.sort(list);

        // Ekrana bastırıyoruz.

        System.out.println("Sıralanmış Diziniz: " + Arrays.toString(list));

    }
}