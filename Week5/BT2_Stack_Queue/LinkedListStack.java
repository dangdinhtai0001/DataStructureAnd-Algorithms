package BT2_Stack_Queue;

import java.util.Iterator;

public class LinkedListStack<T> implements StackInterFace<T> {
	class Node {
		T element;
		Node next;

		public Node(T element) {
			// TODO Auto-generated constructor stub
			this.element = element;
			next = null;
		}
	}

	Node stack;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack == null;
	}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		Node temp = new Node(element);
		if (!isEmpty()) {
			temp.next = stack;
			stack = temp;
		}
		stack = temp;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NullPointerException("Null");
		} else {
			T element = stack.element;
			stack = stack.next;
			return element;
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}

	class StackIterator implements Iterator<T> {
		private Node currentNode = stack;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentNode != null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T data = currentNode.element;
			currentNode = currentNode.next;
			return data;
		}

	}
}
