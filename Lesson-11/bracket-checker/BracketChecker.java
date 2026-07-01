import java.util.Stack;

public class BracketChecker {

    public static boolean checkBrackets(String expression) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);

            if (sym == '(' || sym == '[' || sym == '{') {
                bStack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {

                if (bStack.isEmpty()) {
                    return false;
                }

                char left = bStack.pop();

                if ((sym == ')' && left != '(') ||
                        (sym == ']' && left != '[') ||
                        (sym == '}' && left != '{')) {
                    return false;
                }
            }
        }

        return bStack.isEmpty();
    }
}