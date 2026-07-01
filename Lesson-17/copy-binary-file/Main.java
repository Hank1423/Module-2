import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn file nguồn (source file): ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích (target file): ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Lỗi: File nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Cảnh báo: File đích đã tồn tại! Bạn có muốn ghi đè không? (Y/N): ");
            String confirm = scanner.nextLine();
            if (!confirm.equalsIgnoreCase("Y")) {
                System.out.println("Hủy bỏ thao tác copy.");
                return;
            }
        }

        try {
            long totalBytesCopied = copyFile(sourceFile, targetFile);
            System.out.println("\nSao chép file thành công!");
            System.out.println("Tổng số byte đã copy: " + totalBytesCopied + " bytes.");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra trong quá trình copy: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static long copyFile(File source, File target) throws IOException {
        long byteCount = 0;

        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(target)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                byteCount += bytesRead;
            }
        }

        return byteCount;
    }
}