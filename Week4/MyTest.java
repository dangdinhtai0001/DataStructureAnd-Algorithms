
public class MyTest {
	public static void main(String[] args) {
		SimpleLinkedList<String> list = new SimpleLinkedList<>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.remove(5);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println( list.indexOf("9"));
	}
}
