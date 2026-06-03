class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Thêm các số vào đầu danh sách
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        // In kết quả
        System.out.println("Tổng số nút: " + list.size());
        list.printList();
    }
}