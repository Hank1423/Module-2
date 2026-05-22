import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số dòng của mảng (rows): ");
        int rows = scanner.nextInt();
        System.out.print("Nhập vào số cột của mảng (columns): ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("--- Nhập các phần tử cho mảng ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử tại vị trí [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Ma trận bạn vừa nhập là ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int selectedColumn;
        do {
            System.out.printf("\nBạn muốn tính tổng của cột mấy (tính từ 0 đến %d): ", cols - 1);
            selectedColumn = scanner.nextInt();
            if (selectedColumn < 0 || selectedColumn >= cols) {
                System.out.println("Chỉ số cột không hợp lệ! Vui lòng nhập lại.");
            }
        } while (selectedColumn < 0 || selectedColumn >= cols);

        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][selectedColumn];
        }

        System.out.printf("=> Tổng các phần tử tại cột %d là: %s\n", selectedColumn, sum);

        scanner.close();
    }
}