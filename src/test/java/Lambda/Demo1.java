package Lambda;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {

		int[] a = { 2, 3, 1, 0, 5, 8, 10, 11, 13 };

		Predicate<Integer> p = i -> i % 2 == 1;

		for (int n : a) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
	}
}
