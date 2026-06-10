import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculationExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Hãy nhập x: ");
            int x = sc.nextInt();

            System.out.print("Hãy nhập y: ");
            int y = sc.nextInt();

            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);
        } catch (InputMismatchException e) {
            System.err.println("Xảy ra ngoại lệ: Định dạng dữ liệu nhập vào không phải là số nguyên!");
        }
    }

    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra ngoại lệ toán học: Không thể chia một số cho số 0! (/ by zero)");
        }
    }
}
