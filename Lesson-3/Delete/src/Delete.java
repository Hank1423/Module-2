import java.util.Scanner;
import java.util.Arrays;

public class Delete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        System.out.println("Nhập số cần xóa");
        int x = sc.nextInt();

        int count = 0;
        for(int element : array){
            if (element == x) {
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng");
        } else {
            int[] newArray = new int[array.length - count];
            int indexNew = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] != x){
                    newArray[indexNew] = array[i];
                    indexNew++;
                }
            }
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(newArray));
        }
        sc.close();
    }
}
