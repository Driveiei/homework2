import java.util.ArrayList;
import java.util.List;

public class Recursion {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		unique(list);
		System.out.println(list);
//		String[] x = new String[4];
//		x[0] = "1";
//		x[1] = "2";
//		x[2] = "3";
//		x[3] = "4";
//
//		System.out.println(x.length);
//		x[2] = null;
//		System.out.println(x.length);
//		System.out.println(x[2]);
	}

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		//First 
//		if (list.size() < 2)
//			return list;
//		if (list.get(list.size() - 1).equals((list.get(list.size() - 2)))) {
//			list.remove(list.size() - 1);
//			return unique(list);
//		}
//		return unique(list.subList(0, list.size() - 1));
		//Second
		if (list.size() < 2)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(1);
			return unique(list);
		}
		return unique(list.subList(1, list.size()));
	}
}
