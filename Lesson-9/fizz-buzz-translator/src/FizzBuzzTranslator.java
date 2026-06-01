public class FizzBuzzTranslator {
    public static String translate(int number){
        //throw new UnsupportedOperationException();
        if (number <= 0 || number >= 100){
            return "số không hợp lệ";
        }

        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }

        String numStr = String.valueOf(number);

        if (number % 3 == 0 || numStr.contains("3")) {
            return "Fizz";
        }

        if (number % 5 == 0 || numStr.contains("5")) {
            return "Buzz";
        }

        return readNumberInVietnamese(number);
    }

    private static String readNumberInVietnamese(int number) {
        String[] words = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};

        if (number < 10) {
            return words[number];
        }

        int tens = number / 10;
        int ones = number % 10;

        String tensStr = (tens == 1) ? "muoi" : words[tens] + " ";
        String onesStr = "";

        if (ones != 0) {
            if (ones == 5) {
                onesStr = "lam";
            } else {
                onesStr = words[ones];
            }
        }

        return (tensStr + onesStr).trim();
    }
}
