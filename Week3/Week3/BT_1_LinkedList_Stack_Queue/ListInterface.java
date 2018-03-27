package BT_1_LinkedList_Stack_Queue;

public interface ListInterface<T> extends Iterable<T> {
	public void add(T t);

	public T get(int i);

	public void set(int i, T t);

	public void remove(T t);

	public void remove(int i);

	public boolean isContain(T t);

	public int size();

	public boolean isEmpty();
}
