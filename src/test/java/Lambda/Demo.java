package Lambda;

import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {

		int[] a = { 5, 15, 20, 25, 24, 3, 40, 55, 51, 58, 60, 64, 52 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;

		for (int n : a) {
//			if(p1.test(n) && p2.test(n))
			if (p1.and(p2).test(n)) {
				System.out.println(n);
			}
		}

	}

}
