package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size = 0;

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            growArray();
        }
        items[size++] = item;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == items.length) {
            growArray();
        }
        
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = item;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) items[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T item = (T) items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size--;
        return item;
    }

    private void growArray() {
        Object[] newArray = new Object[items.length * 2];
        System.arraycopy(items, 0, newArray, 0, items.length);
        items = newArray;
    }
}







