import java.util.Scanner;
public class Main {

    static boolean isPalindromic(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int num = inp.nextInt();


        if (isPalindromic(num)){
            System.out.print(num +" Palindrom bir sayıdır.");
        }

        else {
            System.out.print(num +" Palindrom bir sayı değildir.");
        }

    }
}