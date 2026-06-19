import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath) {
        File file = new File(filePath);
        int sum = 0;

        // Sử dụng try-with-resources để đảm bảo BufferedReader tự động đóng dù có lỗi xảy ra
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("--- Nội dung file ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // Loại bỏ khoảng trắng thừa nếu có trước khi ép kiểu
                sum += Integer.parseInt(line.trim());
            }

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("--------------------");
            System.out.println("Tổng = " + sum);

        } catch (FileNotFoundException e) {
            // Bắt riêng lỗi không tìm thấy file
            System.err.println("Lỗi: File không tồn tại theo đường dẫn đã nhập!");
        } catch (NumberFormatException e) {
            // Bắt riêng lỗi nếu trong file chứa ký tự, chữ hoặc dòng trống không thể chuyển thành số
            System.err.println("Lỗi: Nội dung file chứa dữ liệu không phải là số nguyên!");
        } catch (IOException e) {
            // Bắt các lỗi đọc/ghi file vật lý khác
            System.err.println("Lỗi: Có lỗi xảy ra trong quá trình đọc file!");
        }
    }

    public static void main(String[] args) {
        // Tự động đóng Scanner sau khi dùng xong ở hàm main
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập đường dẫn file: ");
            String path = scanner.nextLine();

            ReadFileExample readfileEx = new ReadFileExample();
            readfileEx.readFileText(path);
        }
    }
}