package task1;

import java.util.Arrays;
import java.util.Iterator;

public class GenericArray<T> {
    Object[] arr;

    GenericArray() {
        arr = new Object[0];
    }

    public void add(T t) {
        Object[] temp_arr = new Object[arr.length + 1];

        for (int index = 0; index < arr.length; index++) {
            temp_arr[index] = arr[index];
        }
        temp_arr[temp_arr.length - 1] = t;

        arr = temp_arr;
    }

    public void remove(T t) {
        Integer position = find(t);
        Object[] temp_arr = new Object[arr.length - 1];

        if (position != null) {
            for (int i = 0; i < position; i++) {
                temp_arr[i] = arr[i];
            }

            for (int i = position; i < arr.length - 1; i++) {
                temp_arr[i] = arr[i + 1];
            }
        }

        arr = temp_arr;
    }

    public Integer find(T t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                return i;
            }
        }
        return null;
    }

    public String info() {
        return Arrays.toString(arr);
    }

    public class GenericIterator<T> implements Iterator<T>, Iterable<T> {
        private T[] arr;
        private Integer index = 0;

        public GenericIterator(T[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return (arr.length > index);
        }

        @Override
        public T next() {
            if (hasNext()) {
                return arr[index++];
            }
            return null;
        }

        @Override
        public Iterator<T> iterator() {
            return this;
        }
    }
}
