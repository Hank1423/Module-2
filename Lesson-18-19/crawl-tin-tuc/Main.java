import src.CrawlPostValidation;
import src.CrawlPost;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap url: ");
        String targetUrl = scanner.nextLine();
        if (targetUrl == null) {
            System.out.println("Chua nhap url");
            return;
        }
        // kiem tra url hop le
        if (!CrawlPostValidation.isValidUrl(targetUrl)) {
            System.out.println("url k hop le");
            return;
        }

        System.out.println("Đang kết nối và tải dữ liệu từ Dân Trí...");

        try {
            String htmlContent = CrawlPost.fetchHTML(targetUrl);

            System.out.println("Tải dữ liệu thành công! Tiến hành lọc tin tức:\n");
            System.out.println("Danh sách tin tức vừa cập nhật");

            CrawlPost.extractNews(htmlContent);

            System.out.println("================================================================");

        } catch (IOException e) {
            System.out.println("Lỗi kết nối hoặc không thể đọc dữ liệu: " + e.getMessage());
        }
    }


}