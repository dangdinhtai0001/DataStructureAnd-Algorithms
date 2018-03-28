package MidTerm2016;

import java.util.HashMap;
import java.util.Map;

public class Translate {
	private static HashMap<String, String> dictionary(String s[], String d[]) {
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			map.put(s[i], d[i]);
		}
		return map;
	}
	
	private static String translate(String [] strings, Map<String, String> dictionary) {
		String re = "";
		for (int i = 0; i < strings.length; i++) {
			if (dictionary.containsKey(strings[i])) {
				re += dictionary.get(strings[i]) + " ";
			}
		}
		return re.trim();
	}
	
	private static String translate2(String [] strings, Map<String, String> dictionary) {
		return new StringBuffer(recursion(0, dictionary, strings)).toString().trim();
	}
	
	private static String recursion(int i,Map<String, String> dictionary,String [] strings) {
		if (i >= strings.length ) {
			return "";
		}
		String re = "";
		re += dictionary.get(strings[i]) + " ";
		return re += recursion(i+1, dictionary, strings);
		
	}
	
	public static void main(String[] args) {
		String[] a = {"1","2","3","4","5","6","7","8","9"};
		String[] b = {"one","two","three","four","five","six","seven","eight","nine","ten"};
		HashMap<String, String> dic = dictionary(a, b);
		System.out.println(translate("1 1 1 1 2 3 4".split(" "), dic));
		System.out.println(translate2("1 1 1 1 2 3 4".split(" "), dic));
	}
}
