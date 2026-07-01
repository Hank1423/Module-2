public class BinarySearchTree {
    Node root;

    public void preOrderTraversal(){
        System.out.print("Kết quả duyệt Preorder: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if(node == null){
            return;
        }

        System.out.print(node.value + " ");

        preOrder(node.left);

        preOrder(node.right);
    }
}
