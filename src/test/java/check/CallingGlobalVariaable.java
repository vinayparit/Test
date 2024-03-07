package check;

public class CallingGlobalVariaable {
	int x = 10;

	public static void main(String[] args) {
		CallingGlobalVariaable c= new CallingGlobalVariaable();
		System.out.println(c.x);
	}

}
