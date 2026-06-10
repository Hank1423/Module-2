import java.util.Stack;
public class ArrayReverser {
    public static void reverse(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }
    }
}
