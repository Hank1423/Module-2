import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> items;

    public Queue() {
        this.items = new LinkedList<>();
    }

    public void enqueue(T element) {
        this.items.addLast(element);
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items.removeFirst();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items.getFirst();
    }

    public int size() {
        return this.items.size();
    }
}