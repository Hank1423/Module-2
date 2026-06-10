import java.util.LinkedList;
import java.util.Scanner;
public class Main {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhập vào một chuỗi: ");
       String input = scanner.nextLine();

       LinkedList<Character> maxList = new LinkedList<>();

       for (int i = 0; i < input.length(); i++){
           LinkedList<Character> currentList = new LinkedList<>();
           currentList.add(input.charAt(i));
           for (int j = i + 1; j < input.length(); j++){
               if (input.charAt(j) > currentList.getLast()){
                   currentList.add(input.charAt(j));
               }
           }

           if (currentList.size() > maxList.size()){
               maxList.clear();
               maxList.addAll(currentList);
           }
       }

       System.out.print("Chuỗi tăng dần lớn nhất: ");
       for (Character ch : maxList){
           System.out.print(ch);
       }
       System.out.println();
   }
}
