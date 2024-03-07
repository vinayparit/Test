package check;

public class StaticVariableToNonStaticMethod {

	static int x=10;
	
	public void test()
	{
		System.out.println(this.x); //way 1
		System.out.println(x); // way 2
		StaticVariableToNonStaticMethod s=new StaticVariableToNonStaticMethod();
		System.out.println(s.x); //way 3
		System.out.println(StaticVariableToNonStaticMethod.x); //way 4
		
		
	}
	
}
