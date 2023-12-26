public class Main {
    public static void main(String[] args) {

        // Verilen senaryoya uygun matrisi tanımlıyoruz.


        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Transpozunu bulmak için aşağıdaki methodu kullanıyoruz.

        int[][] transpose = transposeFind(matrix);

        // Matrisi ekrana yazdırıyoruz.

        System.out.println("Matrix:");
        printMatrix(matrix);

        // Matrisin transpozunu ekrana yazdırıyoruz.

        System.out.println("Transpose:");
        printMatrix(transpose);
    }

    public static int[][] transposeFind(int[][] matrix) {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        // Ters döndürmek için aşağıdaki işlemi uyguluyoruz.

        int[][] transpose = new int[colNum][rowNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Standard matris yazdırma fonksiyonunu kullanarak matrisimizi yazdırıyoruz.

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
