package com.coderscampus.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    private CustomArrayList<String> customList;

    @BeforeEach
    void setUp() {
        customList = new CustomArrayList<>();
    }

    @Test
    void testAdd() {
        assertTrue(customList.add("element 1"));
        assertEquals(1, customList.getSize());
        assertEquals("element 1", customList.get(0));
    }

    @Test
    void testAddAtIndex() {
        customList.add("element 1");
        customList.add("element 3");
        customList.add(1, "element 2");
        assertEquals(3, customList.getSize());
        assertEquals("element 2", customList.get(1));
    }

    @Test
    void testGet() {
        customList.add("element 1");
        assertEquals("element 1", customList.get(0));
    }

    @Test
    void testRemove() {
        customList.add("element 1");
        customList.add("element 2");
        String removedItem = customList.remove(0);
        assertEquals("element 1", removedItem);
        assertEquals(1, customList.getSize());
        assertEquals("element 2", customList.get(0));
    }

    @Test
    void testGetSize() {
        customList.add("element 1");
        customList.add("element 2");
        assertEquals(2, customList.getSize());
    }

    @Test
    void testIndexOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> customList.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> customList.add(1, "element"));
        assertThrows(IndexOutOfBoundsException.class, () -> customList.remove(0));
    }
}


















//public interface CustomList<T> {
	
//	boolean add (T item);
//	boolean add(int index, T item)throwsIndexOutOfBoundsException;
//	int getSize();
//	T get(int index) throwsIndexOutOfBoundsException;
//	T remove(int index) throwsIndexOutOfBoundsException;
//}