public class Client {
    public static void main(String[] args) {
        String fileUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Firefox_logo%2C_2019.svg/1280px-Firefox_logo%2C_2019.svg.png";
        String savePath = "java_logo.png";

        System.out.println("KHỞI CHẠY ỨNG DỤNG DOWNLOAD QUA PROXY");

        Downloader downloader = new FileDownloaderProxy();

        downloader.download(fileUrl, savePath);
    }
}