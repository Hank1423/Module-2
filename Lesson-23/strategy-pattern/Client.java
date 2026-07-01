public class Client {
    public static void main(String[] args) {
        User user = new User("Hank", "hank@gmail.com");

        System.out.println("Lưu trữ bằng file xml");
        UserController controller1 = new UserController(new XMLStorage());
        controller1.store(user);

        System.out.println("\nLưu trữ vào csdl mySQL");
        UserController controller2 = new UserController(new MySQLStorage());
        controller2.store(user);

        controller2.setStorage(new XMLStorage());
        System.out.println("Sau khi thay đổi cài đặt controller2:");
        controller2.store(user);
    }
}