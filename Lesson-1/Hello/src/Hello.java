import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ac.nextLine();
        System.out.println("Hello " + name);
    }
}
