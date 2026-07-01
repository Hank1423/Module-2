public class Main {
    public static void main(String[] args) {
        System.out.println("   KIỂM TRA CHUỖI PALINDROME (CHỈ SỬ DỤNG QUEUE)     ");

        String[] testStrings = {
                "Able was I ere I saw Elba",
                "Radar",
                "Hello World",
                "A man a plan a canal Panama"
        };

        for (String test : testStrings) {
            boolean result = PalindromeChecker.isPalindrome(test);
            System.out.println("Chuỗi kiểm tra: \"" + test + "\"");
            System.out.println("-> Kết quả: " + (result ? "LÀ chuỗi Palindrome" : "KHÔNG PHẢI chuỗi Palindrome"));
            System.out.println("-----------------------------------------------------");
        }
    }
}