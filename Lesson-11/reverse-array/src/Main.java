import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Mảng trước khi đảo: " + Arrays.toString(numbers));

        ArrayReverser.reverse(numbers);
        System.out.println("Mảng sau khi đảo: " + Arrays.toString(numbers));

        System.out.println("------------------------------------");

        String text = "Học lập trình Java";
        System.out.println("Chuỗi trước khi đảo: " + text);

        String result = StringReverser.reverseWords(text);
        System.out.println("Chuỗi sau khi đảo: " + result);
    }
}