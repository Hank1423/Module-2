import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng (SIZE): ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        
        scanner.close();
    }
}