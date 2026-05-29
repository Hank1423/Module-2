import java.util.Arrays;
import src.Point3D;
import src.Point2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check Point2D");
        Point2D p2a = new Point2D();
        System.out.println("Khởi tạo mặc định p2a: " + p2a);

        Point2D p2b = new Point2D(3.5f, 4.5f);
        System.out.println("Khởi tạo có tham số p2b: " + p2b);

        p2b.setXY(10.0f, 20.0f);
        System.out.println("Sau khi setXY p2b: " + p2b);
        System.out.println("Mảng getXY của p2b: " + Arrays.toString(p2b.getXY()));

        System.out.println();

        System.out.println("Check Point3D");
        Point3D p3a = new Point3D();
        System.out.println("Khởi tạo mặc định p3a: " + p3a);

        Point3D p3b = new Point3D(1.5f, 2.5f, 3.5f);
        System.out.println("Khởi tạo có tham số p3b: " + p3b);

        p3b.setXYZ(5.5f, 6.5f, 7.5f);
        System.out.println("Sau khi setXYZ p3b: " + p3b);
        System.out.println("Mảng getXYZ của p3b: " + Arrays.toString(p3b.getXYZ()));

        System.out.println("Tọa độ X của p3b: " + p3b.getX());
    }
}