public class FileDownloaderProxy implements Downloader{
    private FileDownloader realDownloader;

    private static final String FIREFOX_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:128.0) Gecko/20100101 Firefox/128.0";
    @Override
    public void download(String urlString, String destinationPath) {
        if (realDownloader == null) {
            System.out.println("[Proxy] Đang tự động cấu hình User-Agent Firefox mặc định...");
            realDownloader = new FileDownloader(FIREFOX_USER_AGENT);
        }
        realDownloader.download(urlString, destinationPath);
    }
}
