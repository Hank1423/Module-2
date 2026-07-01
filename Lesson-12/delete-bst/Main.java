public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.right = new Node(40);

        tree.root.left.right = new Node(16);

        tree.root.right.left = new Node(30);
        tree.root.right.right = new Node(80);

        tree.root.right.left.left = new Node(27);
        tree.root.right.right.left = new Node(50);

        System.out.print("Cây ban đầu: ");
        tree.inOrderTraversal();

        System.out.println("\n--- Thực hiện xóa nút 10 (Không có con trái) ---");
        tree.delete(10);
        System.out.print("Cây sau khi xóa 10: ");
        tree.inOrderTraversal();

        System.out.println("\n--- Thực hiện xóa nút gốc 20 (Có con trái) ---");
        tree.delete(20);
        System.out.print("Cây sau khi xóa 20: ");
        tree.inOrderTraversal();
    }
}
