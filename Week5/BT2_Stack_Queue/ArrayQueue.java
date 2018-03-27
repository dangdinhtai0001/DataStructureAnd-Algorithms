package BT2_Stack_Queue;

import java.util.Iterator;

public class ArrayQueue<T> implements QueueInterface<T> {
	private T[] queue;
	private int n = 0;
	private int top = 0;
	private int count = 0;
	private int default_size = 100;

	public ArrayQueue(int capacity) {
		// TODO Auto-generated constructor stub
		n = capacity;
		queue = (T[]) new Object[capacity];
	}

	public ArrayQueue() {
		// TODO Auto-generated constructor stub
		n = default_size;
		queue = (T[]) new Object[default_size];
	}

	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		if (this.count == n -1) {
			increaseSize();
		}
		
		queue[this.count] = element;
		this.count++;
	}
	private void increaseSize() {
		this.default_size += 10 ; 
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[this.default_size] ; 
		for (int i = 0; i < queue.length; i++) {
			newArray[i] = queue[i] ; 
		}
		
		this.queue = newArray ; 
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	class ArrayQueueIterator implements Iterator<T> {
		private int current = top;
		private int num = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return num < count;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T data = queue[(current + num) % n];
			num++;
			return data;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}
}
