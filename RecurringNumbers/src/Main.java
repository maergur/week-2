public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 4, 4, 2, 9, 10, 21, 8, 33, 8, 1,40,40,24,24};

        // Çift sayıları ve tekrar eden çift sayıları bastırmak için bir dizi oluşturuyoruz.

        int[] duplicates = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {

                // Çift sayı olup olmadığını kontrol etmek için % mod kullanıyoruz.

                if (list[i] == list[j] && list[i] % 2 == 0) {
                    if (!isFind(duplicates, list[i])) {
                        duplicates[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }

        for (int value : duplicates) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
