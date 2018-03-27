package BT_1_LinkedList_Stack_Queue;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
	private T[] array;
	private int size = 0;
	private static final int defaultCapacity = 100;

	@SuppressWarnings("unchecked")
	public SimpleArrayList() {
		// TODO Auto-generated constructor stub
		array = (T[]) new Object[defaultCapacity]; 
	}

	@SuppressWarnings("unchecked")
	public SimpleArrayList(int capacity) {
		// TODO Auto-generated constructor stub
		array = (T[]) new Object[capacity];
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		if (this.size == array.length) {
			this.size = this.size * 2;
			this.array = Arrays.copyOf(array, size);
		}
		array[size++] = t;
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		if (i > size) {
			throw new IndexOutOfBoundsException("Cac");
		}
		return array[i];
	}

	@Override
	public void set(int i, T t) {
		// TODO Auto-generated method stub
		if (i > size) {
			throw new IndexOutOfBoundsException("Cac");
		}
		 array[i] = t;
	}

	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		if (i < size) {
			for (int j = i; j < size; j++) {
				array[j] = array[j + 1];
			}
			size--;
		} else
			throw new IndexOutOfBoundsException("index = " + i + " size = " + size);
	}
	
	public int indexOf(T data) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isContain(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public void remove(T t) {
		// TODO Auto-generated method stub

	}

}
