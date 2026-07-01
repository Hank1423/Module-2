import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void push(T element) {
        this.items.add(element);
    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items.remove(this.items.size() - 1);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items.get(this.items.size() - 1);
    }

    public int size() {
        return this.items.size();
    }

    public void clear() {
        this.items.clear();
    }
}