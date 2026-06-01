public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ứng dụng Calculator đang chạy ---");
        int cong = Calculator.calculate(20, 10, Calculator.ADDITION);
        System.out.println("Kết quả 20 + 10 = " + cong);
        int chia = Calculator.calculate(20, 5, Calculator.DIVISION);
        System.out.println("Kết quả 20 / 5 = " + chia);
        System.out.println("\n[Gợi ý]: Hãy bấm vào biểu tượng Run (hình tam giác xanh) ở file CalculatorTest để chạy các kịch bản kiểm thử JUnit.");
    }
}