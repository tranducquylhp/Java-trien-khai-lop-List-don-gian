import java.util.Arrays;

public class MyList <E> {
    private int size =0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        if (size == DEFAULT_CAPACITY){
            ensureCapa();
        } else {
            elements[size++] = e;
        }
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i){
        if (i>size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        } else return (E) elements[i];
    }


}
