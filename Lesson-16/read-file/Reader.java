import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<Country> readFile(String filePath) {
        List<Country> countries = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists()) {
            System.err.println("Lỗi: Không tìm thấy file CSV tại " + filePath);
            return countries;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                if (data.length == 3) {
                    int id = Integer.parseInt(data[0].trim());

                    String code = data[1].trim().replaceAll("\"", "");
                    String name = data[2].trim().replaceAll("\"", "");

                    Country country = new Country(id, code, name);
                    countries.add(country);
                }
            }
        } catch (IOException e) {
            System.err.println("Có lỗi khi đọc file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Lỗi: Định dạng ID trong file CSV không phải là số hợp lệ");
        }
        return countries;
    }
}
