package check;

public class NonStaticToNonStatic {

	int x=10;
	public void test()
	{
		
		System.out.println(this.x); //way 1
		NonStaticToNonStatic s=new NonStaticToNonStatic();
		System.out.println(s.x); //way 2
		
 	}
	
}
