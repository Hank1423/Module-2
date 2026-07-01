import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(15);
        mySet.add(42);
        mySet.add(7);
        mySet.add(89);
        mySet.add(23);

        System.out.println("Khởi chạy ứng dụng qua adapter");

        CollectionOperations adapter = new CollectionUtilsAdapter();

        int maxValue = adapter.findMax(mySet);

        System.out.println("Giá trị lớn nhất tìm được là: " + maxValue);
    }
}