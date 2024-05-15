package Lambda;



// Predicate is a pre defined functional lambda expression
// it is used as conditional check statement
// it has only one abstract method "test()"

public class Predicate {

	public static void main(String[] args) {

		java.util.function.Predicate<Integer> pri = (i) -> (i > 10);
		System.out.println(pri.test(2));
		
		java.util.function.Predicate<String> pr=s->(s.length()>4);
		String data[]= {"hi", "hello", "welcome", "good","day","you"};
		for(String d:data)
		{
			if(pr.test(d))
			{
				System.out.println(d);
			}
		}
		
	}

}
