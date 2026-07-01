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

        int target1 = 19;
        if (tree.search(target1)) {
            System.out.println("Tìm thấy phần tử " + target1 + " trong cây.");
        } else {
            System.out.println("Không tìm thấy phần tử " + target1);
        }

        int target2 = 99;
        if (tree.search(target2)) {
            System.out.println("Tìm thấy phần tử " + target2 + " trong cây.");
        } else {
            System.out.println("Không tìm thấy phần tử " + target2 + " (Kết quả đúng vì 99 không có trong cây).");
        }
    }
}
