import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if (capacity >= 0){
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity không hợp lệ: " + capacity);
        }
    }

    public void add(int index, E element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" + size);
        }
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[size - 1] = null;
        size--;
        return oldValue;
    }

    public int size(){
        return this.size;
    }

    private void ensureCapacity(int minCapacity){
        if (minCapacity > elements.length){
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity){
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
            System.out.println("Đã tăng kích thước mảng lên: " + newCapacity);
        }
    }

}
