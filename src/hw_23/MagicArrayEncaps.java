package hw_23;

import java.util.Arrays;

public class MagicArrayEncaps {
    private int[] array;
    private int cursor;

    public MagicArrayEncaps() {
        this.array = new int[10];
    }

    public MagicArrayEncaps(int[] array) {
        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            add(array);
        }
    }

    public void add(int value) {
        if (cursor == array.length) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    private void expandArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, cursor);
        array = newArray;
    }

    public void add(int... numbers) {
        for (int num : numbers) {
            add(num);
        }
    }

    public String toString() {
        if (cursor == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]).append(i < cursor - 1 ? ", " : "]");
        }
        return result.toString();
    }

    public int size() {
        return cursor;
    }

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return -1;
    }

    public int remove(int index) {
        if (index >= 0 && index < cursor) {
            int value = array[index];
            System.arraycopy(array, index + 1, array, index, cursor - index - 1);
            cursor--;
            return value;
        }
        return -1;
    }

    public boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public int[] toArray() {
        return Arrays.copyOf(array, cursor);
    }

    // -----------------

    public int getCursor() {
        return cursor;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, cursor);
    }

    public void setArray(int[] newArray) {
        if (newArray != null) {
            this.array = Arrays.copyOf(newArray, newArray.length * 2);
            this.cursor = newArray.length;
        }
    }
}