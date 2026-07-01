import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(array));

        System.out.print("\nNhập giá trị cần tìm (value): ");
        int value = scanner.nextInt();

        int resultIndex = binarySearch(array, 0, array.length - 1, value);

        if (resultIndex != -1) {
            System.out.println("Tìm thấy! Phần tử " + value + " nằm ở vị trí index: " + resultIndex);
        } else {
            System.out.println("Không tìm thấy phần tử " + value + " trong mảng.");
        }

        scanner.close();
    }

    public static int binarySearch(int[] array, int left, int right, int value) {

        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle;
        }

        if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        }

        return binarySearch(array, left, middle - 1, value);
    }
}