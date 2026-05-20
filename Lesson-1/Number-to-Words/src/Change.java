import java.util.Scanner;
public class Change {
    public static String readOnes(int num){
        return switch (num) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }

    public static String readTeens(int num) {
        return switch (num) {
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "fifteen";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            default -> "";
        };
    }

    public static String readTens(int num) {
        return switch (num) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> "";
        };
    }

    public static String readNumber(int num){
        if(num < 0 || num > 999){
            return "out of ability";
        }

        if(num < 10){
            return readOnes(num);
        }

        if(num < 20){
            return readTeens(num);
        }

        if(num < 100){
            int tens = num / 10;
            int ones = num % 10;

            if (ones == 0){
                return readTens(tens);
            } else {
                return readTens(tens) + " " + readOnes(ones);
            }
        }

        int hundreds = num / 100;
        int remainder = num % 100;

        String result = readOnes(hundreds) + " hundred";

        if (remainder > 0) {
            result += " and " + readNumber(remainder);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên không âm (tối đa 3 chữ số): ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            String result = readNumber(number);
            System.out.println("Kết quả: " + result);
        } else {
            System.out.println("out of ability");
        }

        scanner.close();
    }
}
