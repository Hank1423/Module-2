public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        Solution.enQueue(q, 14);
        Solution.enQueue(q, 22);
        Solution.enQueue(q, -6);

        Solution.displayQueue(q);

        System.out.println("Phần tử bị lấy ra: " + Solution.deQueue(q));
        System.out.println("Phần tử bị lấy ra: " + Solution.deQueue(q));

        Solution.displayQueue(q);

        Solution.enQueue(q, 9);
        Solution.enQueue(q, 20);

        Solution.displayQueue(q);
    }
}