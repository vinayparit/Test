package check;

public class Demo {

	static int y = 20;

	public static void main(String[] args) {

		y = 100;// way 1
		System.out.println(y);
		Demo d = new Demo();
		d.y = 200; // way 2
		System.out.println(y);
		Demo.y = 50; // way 3
		System.out.println(y);
		
	}
}
