import java.util.Iterator;

@SuppressWarnings({ "unchecked", "deprecation" })
public class SimpleLinkedList<T> implements ListInterface<T> {
	class Node {
		T data;
		Node next;
	}

	private Node top = null;
	private Node bot = null;
	private int n = 0;

	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		Node temp = new Node(), p = new Node();

		temp.data = data;

		if (top == null) {
			top = temp;
		} else {
			p = top;
			while (p.next != null) {
				p = p.next;
			}
			p.next = temp;
		}
		n++;
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		Node temp = top;
		if (i < 0 || i >= size()) {
			return null;
		}
		for (int j = 0; j < i; j++) {
			temp = temp.next;
		}
		return temp.data;
	}

	@Override
	public void set(int i, T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i >= size()) {
			throw new IllegalArgumentException("Bad index");
		}
		if (i == 0) {
			top = top.next;
			n--;
		} else {
			Node temp = top;
			for (int j = 0; j < i - 1; j++) {
				temp = temp.next;
			}
			Node current = temp.next;
			temp.next = current.next;
			n--;
		}
	}

	@Override
	public boolean isContain(T data) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public int indexOf(T data) {
		// TODO Auto-generated method stubNode p = top;
		if (size() == 0) {
			return -1;
		}
		Node temp = top;
		int index = 0;
		while (!temp.data.equals(data) && index < size()) {
			temp = temp.next;
		}
		if (index < size()) {
			return index;
		} else
			return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}

	class LinkedListIterator implements Iterator<T> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub

			return null;
		}

	}

}
