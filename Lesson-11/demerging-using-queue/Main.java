import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> database = new ArrayList<>();
        database.add(new Employee("Nguyễn Văn A", "Nam", "1995-03-12"));
        database.add(new Employee("Trần Thị B",   "Nu",  "1997-08-24"));
        database.add(new Employee("Lê Văn C",     "Nam", "1999-01-05"));
        database.add(new Employee("Phạm Minh D",  "Nam", "2000-11-30"));
        database.add(new Employee("Hoàng Hoàng E", "Nu",  "2002-05-14"));
        database.add(new Employee("Vũ Thị F",     "Nu",  "2005-07-19"));

        System.out.println("Danh sách gốc (đã sắp xếp theo ngày sinh)");
        for (Employee emp : database) {
            System.out.println(emp);
        }

        List<Employee> sortedDatabase = DemergingSystem.demergePersonnel(database);

        System.out.println("\nDanh sách sau khi demerging");
        for (Employee emp : sortedDatabase) {
            System.out.println(emp);
        }
    }
}
