package src;

public class InsertionSort {
    public static void sortAndShowSteps(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            System.out.printf("Bước %d: Xét phần tử key = %d (index %d)\n", i, key, i);

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;

                System.out.print("   -> Đang dịch chuyển: ");
                ArrayDisplay.printArray(arr);
            }

            arr[j+1] = key;

            System.out.print("   => Kết thúc bước " + i + ": ");
            ArrayDisplay.printArray(arr);
            System.out.println();
        }
    }
}
