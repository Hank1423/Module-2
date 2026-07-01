public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleanedInput = input.toLowerCase().replaceAll("\\s+", "");

        if (cleanedInput.length() <= 1) {
            return true;
        }

        Queue<Character> queue = new Queue<>();
        int length = cleanedInput.length();

        for (int i = 0; i < length; i++) {
            queue.enqueue(cleanedInput.charAt(i));
        }

        for (int i = length - 1; i >= 0; i--) {
            char charFromEnd = cleanedInput.charAt(i);
            char charFromQueue = queue.dequeue();

            if (charFromEnd != charFromQueue) {
                return false;
            }
        }

        return true;
    }
}