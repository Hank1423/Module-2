import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSong{
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("songs.html")));

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}