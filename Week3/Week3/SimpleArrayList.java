import java.util.Iterator;

@SuppressWarnings({ "unchecked" })
public class SimpleArrayList<T> implements ListInterface<T> {

	private T[] array;
	private int n = 0;
	private int defaultSize = 100;

	public SimpleArrayList() {
		array = (T[]) new Object[defaultSize];
	}

	public SimpleArrayList(int capacity) {
		// Hàm dựng với kích thước mảng là capacity
		array = (T[]) new Object[capacity];
	}

	public void add(T data) {
		if (this.n == array.length) {
			this.n = this.n * 2;
			T newArray[] =(T[]) new Object[this.n];
			
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
		}
		array[n++] = data;
	}

	public T get(int i) {
		if (i > this.n) {
			throw new IndexOutOfBoundsException("index = " + i + " size = " + n);
		}
		return array[i];

	}

	public void set(int i, T data) {
		if (i > n) {
			throw new IndexOutOfBoundsException("index = " + i + " size = " + n);
		} else
			array[i] = data;
	}

	public void remove(int i) {
		if (i < n) {
			for (int j = i; j < n; j++) {
				array[j] = array[j + 1];
			}
			n--;
		} else
			throw new IndexOutOfBoundsException("index = " + i + " size = " + n);

	}

	public boolean isContain(T data) {
		return indexOf(data) != -1;
	}

	public int indexOf(T data) {
		for (int i = 0; i < n; i++) {
			if (array[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public Iterator<T> iterator() {
		return new ArrayListIterator();
	}

	class ArrayListIterator implements Iterator<T> {
		private int current = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current < n;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T data = array[current];
			current++;
			return data;
		}

	}

}
