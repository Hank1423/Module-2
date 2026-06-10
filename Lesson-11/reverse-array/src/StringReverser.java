import java.util.Stack;
public class StringReverser {
    public static String reverseWords(String sentence){
        Stack<String> wStack = new Stack<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            String mWord = words[i];
            wStack.push(mWord);
        }
        String outp = "";

        while (!wStack.isEmpty()){
            String mWord = wStack.pop();
            outp = outp + mWord + " ";
        }

        return outp.trim();
    }
}
