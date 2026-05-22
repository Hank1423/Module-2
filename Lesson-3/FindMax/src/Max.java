import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- BƯỚC 1: KIỂM TRA VỚI MA TRẬN CÓ SẴN ---");

        double[][] sampleMatrix = {
                {1.5, 4.2, 3.8},
                {9.1, 5.6, 2.4}
        };

        double maxSample = sampleMatrix[0][0];
        int maxRowSample = 0;
        int maxColSample = 0;

        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                if (sampleMatrix[i][j] > maxSample) {
                    maxSample = sampleMatrix[i][j];
                    maxRowSample = i;
                    maxColSample = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận mẫu là: " + maxSample
                + " tại tọa độ: [" + maxRowSample + "][" + maxColSample + "]\n");

        System.out.println("--- BƯỚC 2: NHẬP MA TRẬN TỪ BÀN PHÍM ---");

        System.out.print("Nhập số hàng (rows) của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột (columns) của ma trận: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("\n--- KẾT QUẢ TÌM KIẾM ---");
        System.out.println("Giá trị lớn nhất trong ma trận bạn vừa nhập là: " + max);
        System.out.println("Tọa độ của phần tử này là: [" + maxRow + "][" + maxCol + "]");

        scanner.close();
    }
}