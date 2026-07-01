public class Main {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = new Node(27);

        tree.root.left = new Node(14);
        tree.root.right = new Node(35);

        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);

        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);

        System.out.println("Kết quả duyệt Postorder:");
        tree.postOrderTraversal();
    }
}
