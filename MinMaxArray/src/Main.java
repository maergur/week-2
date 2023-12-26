import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};


        System.out.println(Arrays.toString(list));

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int num = inp.nextInt();

        Arrays.sort(list);
        int minNum = list[0];
        int maxNum = list[list.length - 1];

        for (int i : list) {
            if (i < num && num - i < num - minNum) {
                minNum = i;
            } else if (i > num && i - num < maxNum - num) {
                maxNum = i;
            }
        }

        System.out.println("En yakın küçük sayı: " + minNum);
        System.out.println("En yakın büyük sayı: " + maxNum);
    }
}
