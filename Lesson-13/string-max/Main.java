import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = input.nextLine();

        if (str == null || str.isEmpty()) {
            System.out.println("Chuỗi rỗng.");
            return;
        }

        int maxStart = 0;
        int maxLength = 1;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i - 1)) {
                currentLength++;
            } else {
                currentStart = i;
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = currentStart;
            }
        }

        String maxSubstring = str.substring(maxStart, maxStart + maxLength);
        System.out.println("Chuỗi liên tiếp dài nhất: " + maxSubstring);

        input.close();
    }
/*********************************************************************************
 * TÍNH TOÁN ĐỘ PHỨC TẠP THỜI GIAN (TIME COMPLEXITY):                            *
 * *
 * - Vòng lặp chính: Chạy n lần                           *
 * - Hàm ngầm bên trong:                                                         *
 * + list.contains() -> Duyệt ngầm LinkedList mất tối đa O(n).                 *
 * + max.addAll()    -> Sao chép phần tử mất tối đa O(n).                      *
 * *
 * => Thao tác O(n) lồng bên trong vòng lặp O(n).                                *
 * => T(n) = O(n * n) = O(n^2)                          *
 * *
 * KẾT LUẬN: Độ phức tạp thời gian của bài toán là O(n^2).                       *
 *********************************************************************************/
}