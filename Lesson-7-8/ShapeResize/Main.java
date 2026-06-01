import src.Rectangle;
import src.Square;
import src.Circle;
import resize.Resizeable;
import color.Colorable;
public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(4.0, 5.0);
        shapes[1] = new Square(6.0);

        Resizeable[] resizeableShapes = new Resizeable[3];
        resizeableShapes[0] = new Circle(3.5);
        resizeableShapes[1] = new Rectangle(4.0, 5.0);
        resizeableShapes[2] = new Square(6.0);

        System.out.println("Size Check");

        for (Resizeable shape : resizeableShapes) {
            String shapeName = shape.getClass().getSimpleName();

            double areaBefore = 0;
            if (shape instanceof Circle) {
                areaBefore = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaBefore = ((Rectangle) shape).getArea();
            }

            double percent = Math.random() * 99 + 1;

            shape.resize(percent);

            double areaAfter = 0;
            if (shape instanceof Circle) {
                areaAfter = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaAfter = ((Rectangle) shape).getArea();
            }

            System.out.printf("Hình: %s\n", shapeName);
            System.out.printf("- Tăng kích thước thêm: %.2f%%\n", percent);
            System.out.printf("- Diện tích TRƯỚC: %.2f\n", areaBefore);
            System.out.printf("- Diện tích SAU:  %.2f\n", areaAfter);
            System.out.println("------------------------------------");
        }

        System.out.println("Color Check");
        src.Shape[] shapeList = new src.Shape[4];
        shapeList[0] = new Circle(3.5);
        shapeList[1] = new Square(5.0);
        shapeList[2] = new Rectangle(4.0, 6.0);
        shapeList[3] = new Square(2.5);

        for (src.Shape s : shapeList) {
            String name = s.getClass().getSimpleName();
            System.out.println("Hình: " + name);

            double area = 0;
            if (s instanceof Circle) {
                area = ((Circle) s).getArea();
            } else if (s instanceof Square) {
                area = ((Square) s).getArea();
            } else if (s instanceof Rectangle) {
                area = ((Rectangle) s).getArea();
            }
            System.out.printf("- Diện tích: %.2f\n", area);

            if (s instanceof Colorable) {
                ((Colorable) s).howToColor();
            }

            System.out.println("----------------------------------------");
        }

    }
}