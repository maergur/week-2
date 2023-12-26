public class Main {
    public static void main(String[] args) {

        // Verilen dizi senaryosunu tanımlıyoruz.

        int[] line = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekansları bulmak için bir method'u çağır

        freqFind(line);
    }

    public static void freqFind(int[] line) {

        // Dizideki en büyük elemanı buluyoruz.

        int maxNum = 0;
        for (int i : line) {
            if (i > maxNum) {
                maxNum = i;
            }
        }

        // Frekansları tutmak için bir dizi oluşturuyoruz.

        int[] freq = new int[maxNum + 1];

        // Diziyi tara ve frekansları güncelliyoruz.

        for (int i : line) {
            freq[i]++;
        }

        // Sonuçları ekrana yazdırıyoruz.

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " sayısı " + freq[i] + " kere tekrar edildi.");
            }
        }
    }
}
