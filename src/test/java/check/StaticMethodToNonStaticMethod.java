package check;

public class StaticMethodToNonStaticMethod {

	
	public static void test()
	{
		
	}
	public void test1()
	{
		this.test();
		test();
		StaticMethodToNonStaticMethod s=new StaticMethodToNonStaticMethod();
		s.test();
		StaticMethodToNonStaticMethod.test();
		
	}
}
