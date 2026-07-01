public class Main {
    public static void main(String[] args) {
        String[] testExpressions = {
                "s * (s - a) * (s - b) * (s - c)",
                "(- b + (b^2 - 4*a*c)^0.5) / 2*a",
                "s * (s - a) * (s - b * (s - c)",
                "s * (s - a) * s - b) * (s - c)",
                "(- b + (b^2 - 4*a*c)^(0.5/ 2*a))",
                "((a + b) * [c - d]}",
        };

        System.out.println("=== KẾT QUẢ KIỂM TRA BIỂU THỨC ===");
        for (String expr : testExpressions) {
            boolean isValid = BracketChecker.checkBrackets(expr);
            System.out.printf("Biểu thức: %-40s => %s\n",
                    expr, (isValid ? "Well (Đúng)" : "Mismatched (Sai)"));
        }
    }
}
