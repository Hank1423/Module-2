import src.Point;
import src.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check Point");
        Point p1 = new Point();
        System.out.println("Điểm mặc định p1: " + p1);

        Point p2 = new Point(1.5f, 3.5f);
        System.out.println("Điểm khởi tạo p2: " + p2);

        p2.setXY(5.0f, 7.0f);
        System.out.println("Điểm p2 sau khi setXY: " + p2);
        System.out.println();

        System.out.println("Check MoveablePoint");
        MoveablePoint mp1 = new MoveablePoint(2.0f, 2.0f);
        System.out.println("Điểm di động mp1 (mặc định vị trí): " + mp1);

        MoveablePoint mp2 = new MoveablePoint(10.0f, 10.0f, 1.5f, 2.5f);
        System.out.println("Điểm mp2 trước khi dịch chuyển: " + mp2);

        mp2.move();
        System.out.println("Điểm mp2 sau bước dịch chuyển 1: " + mp2);

        mp2.move();
        System.out.println("Điểm mp2 sau bước dịch chuyển 2: " + mp2);
    }
}