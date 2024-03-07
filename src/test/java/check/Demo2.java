package check;

public class Demo2 {
	int x=10;
	public Demo2(int x)
		{
			System.out.println(x);
			this.x=x;
			System.out.println(this.x);
			System.out.println(x);
//			Demo2 d=new Demo2(2);
//			System.out.println(d.x);
			
		}
	public static void main(String[] args) {
		Demo2 d=new Demo2(2);
		System.out.println(d.x);
	
	}
}
