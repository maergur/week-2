import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int num = scanner.nextInt();

        // 0 ve 1 asal sayı değildir.

        if (num < 2) {
            System.out.println(num + " Asal bir sayı değildir.");
        }

        // 0 ve 1 dışındaki sayıları  test ediyoruz.

        else {
            if (isPrime(num, 2)) {
                System.out.println(num + " Asal bir sayıdır.");
            } else {
                System.out.println(num + " Asal bir sayı değildir.");
            }
        }
    }

    // Recursive asal sayı kontrolü yaparken 2'ye bölme sebebimiz recursive methodu limitlemek
    public static boolean isPrime(int a, int divider) {
        if (divider > a / 2) {
            return true;
        }

        // Mod alarak asal olup olmadığına bakıyoruz.

        else {
            if (a % divider == 0) {
                return false;
            } else {
                return isPrime(a, divider + 1);
            }
        }
    }
}