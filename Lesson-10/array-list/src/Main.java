public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(2);

        list.add(0, "Java");
        list.add(1, "Python");

        list.add(2, "JavaScript");

        System.out.println("Kích thước sau khi thêm: " + list.size());

        String deleted = list.remove(1);
        System.out.println("Phần tử vừa bị xóa: " + deleted);
        System.out.println("Kích thước sau khi xóa: " + list.size());
    }
}