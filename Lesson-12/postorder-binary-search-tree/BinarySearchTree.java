public class BinarySearchTree {
    Node root;
    public void postOrderTraversal(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node == null) {
            return;
        }

        postOrder(node.left);

        postOrder(node.right);

        System.out.print(node.value + " ");
    }
}
