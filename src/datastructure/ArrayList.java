package datastructure;

import java.util.Arrays;

public class ArrayList {

    Object[] buffer;
    Integer currentSize;

    public ArrayList() {
        final int INITIAL_SIZE = 10;
        buffer = new Object[INITIAL_SIZE];
        currentSize = 0;
    }

    public int size() {return currentSize;};

    public void add(Object value) {

        buffer[currentSize] = value;
    }

    public void set(int pos, Object element) {
        checkBound(pos);
        buffer[pos] = element;
    }

    public void checkBound(int n) {
        if (n < 0 || n >= currentSize) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Object get(int pos) {
        checkBound(pos);
        return buffer[pos];
    }

    public boolean addLast(Object element) {
        growBuffetIfNecessary();
        currentSize++;
        buffer[currentSize - 1] = element;
        return true;
    }

    public Object remove(int pos) {
        checkBound(pos);

        Object remove = buffer[pos];

        for (int i = pos + 1; i < currentSize; i++) {
            buffer[i-1] = buffer[i];
        }
        currentSize--;
        return remove;
    }

    private void growBuffetIfNecessary() {
        if (currentSize == buffer.length) {
            Object[] newBuffer = new Object[2 * buffer.length];
            for (int i = 0; i < buffer.length; i++) {
                newBuffer[i] = buffer[i];
            }
            buffer = newBuffer;
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.addLast(5);
        arrayList.set(0, 10);
        System.out.println(arrayList.get(0));

        int[] a = {1,2,3};
        int[] b = new int[6];
        for (int i = 0; i < a.length; i++) {
            b[i]= a[i];
        }
        a = b;
        System.out.println(Arrays.toString(a));


    }
}
