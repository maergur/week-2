import java.util.Scanner;
public class Main {
    public static int powerUp(int a, int b){

        if (b == 0) {
            return 1;
        } else {
            // Recursive case
            return a * powerUp(a, b - 1);
        }


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base, power;

        System.out.print("Lütfen bir sayı giriniz: ");
        base = inp.nextInt();

        System.out.print("Lütfen üs giriniz: ");
        power = inp.nextInt();

        System.out.print("İşlem sonucu: " + powerUp(base,power));

    }
}