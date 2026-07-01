class BinarySearchTree {
    Node root;

    public boolean delete(int element) {
        Node parent = null;
        Node current = root;

        while (current != null) {
            if (element < current.value) {
                parent = current;
                current = current.left;
            } else if (element > current.value) {
                parent = current;
                current = current.right;
            } else {
                break;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.left == null) {
            connectParentWithChild(parent, current, current.right);
        }
        else {
            handleCaseWithLeftChild(current);
        }

        return true;
    }

    private void connectParentWithChild(Node parent, Node current, Node child) {
        if (parent == null) {
            root = child;
        } else if (current == parent.left) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    private void handleCaseWithLeftChild(Node current) {
        Node parentOfRightMost = current;
        Node rightMost = current.left;

        while (rightMost.right != null) {
            parentOfRightMost = rightMost;
            rightMost = rightMost.right;
        }

        current.value = rightMost.value;

        if (parentOfRightMost.right == rightMost) {
            parentOfRightMost.right = rightMost.left;
        } else {
            parentOfRightMost.left = rightMost.left;
        }
    }

    public void inOrderTraversal() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }
}