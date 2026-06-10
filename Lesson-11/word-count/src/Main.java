import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String text = "Học lập trình Java rất vui và lập trình Java không khó";

        System.out.println("Văn bản gốc: " + text);

        Map<String, Integer> wordMap = new TreeMap<>();

        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9ăâđêôơưàảãáạằẳẵắặầẩẫấậèẻẽéẹềểễếệìỉĩíịòỏõóọồổỗốộờởỡớợùủũúụừửữứựỳỷỹýỵ]", "");

            if (word.isEmpty()) {
                continue;
            }

            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word);
                wordMap.put(word, count + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("\n--- Kết quả đếm số lần xuất hiện (Đã sắp xếp A-Z) ---");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println("Từ '" + entry.getKey() + "' xuất hiện: " + entry.getValue() + " lần");
        }
    }
}