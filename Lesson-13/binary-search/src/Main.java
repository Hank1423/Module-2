import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(BinarySearch.list, 2));
        System.out.println(binarySearch(BinarySearch.list, 11));
        System.out.println(binarySearch(BinarySearch.list, 79));
        System.out.println(binarySearch(BinarySearch.list, 1));
        System.out.println(binarySearch(BinarySearch.list, 5));
        System.out.println(binarySearch(BinarySearch.list, 80));
    }
}