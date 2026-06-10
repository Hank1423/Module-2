import src.ArrayDisplay;
import src.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.print("Mảng ban đầu: ");
        ArrayDisplay.printArray(arr);
        System.out.println("-----------------------------------------");

        InsertionSort.sortAndShowSteps(arr);

        System.out.println("-----------------------------------------");
        System.out.print("Mảng sau khi sắp xếp hoàn tất: ");
        ArrayDisplay.printArray(arr);
    }
}