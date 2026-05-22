import java.util.Scanner;
import  java.util.Arrays;
public class Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        System.out.print("Nhập số cần chèn: ");
        int x = sc.nextInt();

        System.out.print("Nhập vị trí index cần chèn: ");
        int index = sc.nextInt();

        if (index < 0 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng (Vị trí ngoài biên).");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = x;

            System.out.println("Mảng sau khi chèn: " + Arrays.toString(array));
        }
        sc.close();
    }
}
