public class Converter {
    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber < 0) {
            throw new IllegalArgumentException("Dữ liệu đầu vào phải là một số nguyên không âm.");
        }

        if (decimalNumber == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        int number = decimalNumber;

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }

        return binaryString.toString();
    }
}
