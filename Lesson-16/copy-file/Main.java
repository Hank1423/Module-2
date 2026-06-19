import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== CHƯƠNG TRÌNH SAO CHÉP FILE TEXT ===");

            System.out.print("Nhập đường dẫn tệp nguồn (source file): ");
            String sourcePath = scanner.nextLine();

            System.out.print("Nhập đường dẫn tệp đích (target file): ");
            String targetPath = scanner.nextLine();

            CopyFileText cft = new CopyFileText();
            cft.CopyFileText(sourcePath, targetPath);
        }
    }
}