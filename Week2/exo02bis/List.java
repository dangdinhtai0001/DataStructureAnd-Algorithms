package exo02bis;

public interface List<T> {
	int size();
	void add(T t);
	void add(int index , T t);
	T get (int index);
	void remove(int index);
}
