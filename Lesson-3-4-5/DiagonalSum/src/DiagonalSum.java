import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước (n) của ma trận vuông (n x n): ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        System.out.println("--- Nhập các phần tử cho ma trận ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập phần tử tại vị trí [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Ma trận vuông vừa nhập là ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        double diagonalSum = 0;

        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("------------------------------------");
        System.out.printf("=> Tổng các phần tử trên đường chéo chính là: %s\n", diagonalSum);

        scanner.close();
    }
}