import java.util.List;
public class Main {
    public static void main(String[] args){
        String filePath = "countries.csv";
        Reader reader = new Reader();
        List<Country> countryList = Reader.readFile(filePath);
        System.out.println("Danh sách quốc gia");
        if (countryList.isEmpty()) {
            System.out.println("Không có dữ liệu hiển thị.");
        } else {
            for (Country country : countryList) {
                System.out.println(country);
            }
        }
    }
}
