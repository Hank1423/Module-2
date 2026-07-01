public class BinarySearchTree {
    Node root;

    public boolean search(int element){
        Node current = root;

        while(current != null){
            if (element < current.value) {
                current = current.left;
            } else if (element > current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
