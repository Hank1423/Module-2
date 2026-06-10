import java.util.InputMismatchException;
import java.util.Scanner;
public class TriangleCheck {
    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalTriangleException("Lỗi: Độ dài các cạnh của tam giác phải lớn hơn 0!");
        }

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalTriangleException("Lỗi: Tổng 2 cạnh phải lớn hơn cạnh còn lại!");
        }

        System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " tạo thành một tam giác hợp lệ.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleCheck checker = new TriangleCheck();

        try {
            System.out.println("Check Triangle");
            System.out.print("Nhập vào cạnh thứ nhất (a): ");
            double a = scanner.nextDouble();

            System.out.print("Nhập vào cạnh thứ hai (b): ");
            double b = scanner.nextDouble();

            System.out.print("Nhập vào cạnh thứ ba (c): ");
            double c = scanner.nextDouble();

            checker.checkTriangle(a, b, c);

        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Lỗi: Vui lòng chỉ nhập vào các số thực!");
        }
    }
}
