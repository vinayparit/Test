package check;

public class Minimum {

	public static void main(String[] args) {

		int[] a = { 4, 3, 1, 2, 5, 0 };

		int min = a[0];
		int smin = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				smin = min;
				min = a[i];
			}
		}
		System.out.println(min);
		System.out.println(smin);
	}
}
