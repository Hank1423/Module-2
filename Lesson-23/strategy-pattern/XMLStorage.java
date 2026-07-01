public class XMLStorage implements UserStorage {
    @Override
    public void store(User user){
        System.out.println("Đang chuyển đổi dữ liệu của " + user.getName() + " thành định dạng thẻ <xml>");
        System.out.println("Đã lưu thành công người dùng vào file: users.xml");
    }
}
