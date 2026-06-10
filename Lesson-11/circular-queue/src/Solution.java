class Solution {
    public static void enQueue(Queue q, int value) {
        Node newNode = new Node(value);

        if (q.front == null) {
            q.front = newNode;
            q.rear = newNode;
            q.rear.link = q.front;
        } else {
            q.rear.link = newNode;
            q.rear = newNode;
            q.rear.link = q.front;
        }
    }

    public static Integer deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Hàng đợi trống, không thể lấy phần tử!");
            return null;
        }

        int value = q.front.data;

        if (q.front == q.rear) {
            q.front = null;
            q.rear = null;
        } else {
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    public static void displayQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Hàng đợi trống!");
            return;
        }

        Node temp = q.front;
        System.out.print("Các phần tử trong hàng đợi vòng: ");

        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != q.front);

        System.out.println("(Quay lại đầu hàng: " + q.front.data + ")");
    }
}