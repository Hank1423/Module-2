import src.Circle;
import src.Cylinder;
public class Main {
    public static void main(String[] args) {
        System.out.println("Test Circle");
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.5, "blue");
        System.out.println(c2);
        System.out.println("Diện tích c2: " + c2.getArea());

        System.out.println();

        System.out.println("Test Cylinder");
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        Cylinder cy2 = new Cylinder(3.0, 5.0, "yellow");
        System.out.println(cy2);
        System.out.println("Bán kính đáy cy2: " + cy2.getRadius());
        System.out.println("Diện tích đáy cy2: " + cy2.getArea());
        System.out.println("Thể tích cy2: " + cy2.getVolume());
    }
}