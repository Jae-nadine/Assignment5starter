package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int size = 0;
	
	public CustomArrayList() {
		
	}

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			growArray();
	}
		items[size++] = item;
		return true;
	}
	

	private void growArray() {
		Object [] newArray = new Object[items.length * 2];
		System.arraycopy(items, 0, newArray, 0, items.length);
		items = newArray;
	}
	
	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		return (T) items[index];
	}
	

	@Override
	public int getSize() {
		return size;
	}
	
}








