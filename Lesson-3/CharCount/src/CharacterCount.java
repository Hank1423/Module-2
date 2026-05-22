import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String str = scanner.nextLine();

        System.out.print("Nhập vào ký tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("------------------------------------");
        System.out.printf("Ký tự '%c' xuất hiện %d lần trong chuỗi đã cho.\n", ch, count);

        scanner.close();
    }
}