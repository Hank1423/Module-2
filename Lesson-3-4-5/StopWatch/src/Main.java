import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];
        Random random = new Random();

        System.out.println("Đang khởi tạo 100,000 số ngẫu nhiên...");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        System.out.println("Bắt đầu thuật toán Selection Sort...");
        stopWatch.start();

        selectionSort(array);

        stopWatch.stop();

        System.out.println("Thuật toán đã chạy xong!");
        System.out.println("Tổng thời gian thực thi: " + stopWatch.getElapsedTime() + " mili giây.");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}