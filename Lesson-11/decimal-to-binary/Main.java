public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("   ỨNG DỤNG CHUYỂN ĐỔI HỆ CƠ SỐ SỬ DỤNG STACK (JAVA) ");
        System.out.println("=====================================================\n");

        try {
            int test1 = 30;
            System.out.println("[Test 1] Số thập phân: " + test1);
            System.out.println(" -> Hệ nhị phân thu được : " + Converter.decimalToBinary(test1));
            System.out.println("-----------------------------------------------------");

            int test2 = 111;
            System.out.println("[Test 2] Số thập phân: " + test2);
            System.out.println(" -> Hệ nhị phân thu được : " + Converter.decimalToBinary(test2));
            System.out.println("-----------------------------------------------------");

            int test3 = 0;
            System.out.println("[Test 3] Số thập phân: " + test3);
            System.out.println(" -> Hệ nhị phân thu được : " + Converter.decimalToBinary(test3));
            System.out.println("=====================================================");

        } catch (IllegalArgumentException e) {
            System.err.println("Lỗi dữ liệu đầu vào: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi hệ thống: " + e.getMessage());
        }
    }
}