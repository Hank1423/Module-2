public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Đang tạo kết nối đến CSDL MySQL");
        System.out.println("Thực thi câu lệnh: insert into users (name, email) values ('" + user.getName() + "', '" + user.getEmail() + "');");
        System.out.println("Đã lưu thành công dữ liệu vào bảng 'users'.");
    }
}
