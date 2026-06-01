import CircleComparator.CircleComparator;
import src.Shape;
import src.Circle;
import src.Rectangle;
import src.Square;
import ComparableCircle.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted (Comparable):");
        for (ComparableCircle c : circles) {
            System.out.println(c);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted (Comparable):");
        for (ComparableCircle c : circles) {
            System.out.println(c);
        }

        Circle[] circles2 = new Circle[3];
        circles2[0] = new Circle(3.6);
        circles2[1] = new Circle();
        circles2[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted (Comparator):");
        for (Circle c2 : circles2) {
            System.out.println(c2);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles2, circleComparator);

        System.out.println("After-sorted (Comparator):");
        for (Circle c2 : circles2) {
            System.out.println(c2);
        }
    }
}