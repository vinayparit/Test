package check;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Start");
	}

//	static int y=20;
	{
		System.out.println(10); // We need to create object to execute this block
	}
	static {
		System.out.println(20);
	}

}
