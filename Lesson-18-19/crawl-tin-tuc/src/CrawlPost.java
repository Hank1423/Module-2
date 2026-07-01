package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlPost {

    public void craw() {

    }


    public static String fetchHTML(String urlString) throws IOException {
        StringBuilder content = new StringBuilder();
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        connection.setRequestProperty("Accept-Language", "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7");

        connection.setRequestProperty("Connection", "keep-alive");

        connection.setConnectTimeout(10000);
        connection.setReadTimeout(10000);

        try (InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            connection.disconnect();
        }

        return content.toString();
    }

    public static void extractNews(String html) {
        String regex = "<a(?=[^>]*data-prop=\"title\")(?=[^>]*href=\"([^\"]+)\")[^>]*>(.*?)</a>";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(html);
        int count = 1;
        while (matcher.find()) {
            String href = matcher.group(1);
            String title = matcher.group(2).trim();

            System.out.println("Link: " + href);
            System.out.println("Title: " + title);
            System.out.println();
            count++;
        }

        if (count == 1) {
            System.out.println("Không tìm thấy bài viết nào. Cấu trúc HTML của trang web có thể đã thay đổi.");
        }
    }
}
