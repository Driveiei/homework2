import java.util.ArrayList;
import java.util.List;

/**
 * Recursion test class.
 * 
 * @author Kornphon Noiprasert
 * */
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
		if (list.size() < 2)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(1);
			return unique(list);
		}
		return unique(list.subList(1, list.size()));
	}

	/**
	 * Fibonacci method with slow computation.
	 * 
	 * @param number of fibonnaci function.
	 * @return sum of fibonacci function number.
	 */
	public static long fibonacci(int number) {
		if (number < 2)
			return number;
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

	/**
	 * Fibonacci method with faster computation.
	 * 
	 * @param number of fibonnaci function.
	 * @return sum of fibonacci function number.
	 */
	public static long quickFibonacci(long number) {
		long start = 1;
		long fibonacci1 = 1;
		long fibonacci0 = 0;
		if (number < 2)
			return number;
		return helperFibonacci(number, start, fibonacci1, fibonacci0);

	}

	/**
	 * helperFibonacci helps quickFibonacci computation faster.
	 * 
	 * @param number of fibonnaci function.
	 * @param count the cursor of fibonacci.
	 * @param sum of two previous fibonacci number.
	 * @param the number that 'start' point the cursor.
	 * @return sum of fibonacci function number.
	 */
	public static long helperFibonacci(long n, long start, long num1, long num2) {
		long current = start + 1;
		long sum = num1 + num2;
		if (n == current) return sum;
		return helperFibonacci(n, current, sum, num1);
	}

}
