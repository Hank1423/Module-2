public class MyLinkedList <E>{
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList(){
        this.head = null;
    }

    public void addFirst(int element){
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void printList() {
        Node temp = head;

        System.out.print("Danh sách liên kết hiện tại: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int size() {
        return this.numNodes;
    }
}
