import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan çalışan elemana ait bilgileri istiyoruz.

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen eleman ismini giriniz: ");
        String name = inp.nextLine();

        System.out.print("Lütfen elemana ait maaş bilgisi giriniz: ");
        double salary  = inp.nextDouble();

        System.out.print("Lütfen elemana ait haftalık çalışma süresi giriniz: ");
        int workHours = inp.nextInt();

        System.out.print("Lütfen elemana ait işe alım yılını giriniz: ");
        int hireYear = inp.nextInt();

        Employee e1 = new Employee (name,salary, workHours, hireYear);

        // Elemanın bilgilerini yazdırıyoruz.

        System.out.println(e1.toString());

    }
}
