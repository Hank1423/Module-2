import src.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hình tròn 1 - Bán kính: " + c1.getRadius() + ", Màu sắc: " + c1.getColor());

        Circle c2 = new Circle(5.5, "blue");
        System.out.println("Hình tròn 2 - Bán kính: " + c2.getRadius() + ", Màu sắc: " + c2.getColor());
    }
}
