import static src.BubbleSort.bubbleSort;
import static src.BubbleSort.list;

public class Main {
    public static void main(String[] args){
        bubbleSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
