import java.util.Arrays;
import src.InsertionSort;
public class Main {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, -3, 5, 8, 1, 0, 7};

        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(numbers));
    }
}