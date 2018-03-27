package BT_1_LinkedList_Stack_Queue;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		SimpleArrayList<String> list = new SimpleArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list.isEmpty());
		int i = 0;
		while (list.get(i) != null && i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		list.set(0, "Tai");
		System.out.println(list.get(0));
		
		System.out.println(list.indexOf("0"));
		String a[] = {"1","2"};
		String b[] = Arrays.copyOf(a, 3);
		for (String j : b) {
			System.out.println(j);
		}

	}
}
