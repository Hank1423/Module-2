import java.util.Scanner;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhập phần tử cho mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập phần tử cho mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array3, 0, array1.length);

        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        System.out.println("Mảng 1: " + Arrays.toString(array1));
        System.out.println("Mảng 2: " + Arrays.toString(array2));
        System.out.println("Mảng sau khi gộp (Mảng 3): " + Arrays.toString(array3));

        scanner.close();
    }
}