package check;


@FunctionalInterface
interface Cab {
	public String bookCab(String source, String dest);
}

// class Ola implements Cab
//{
//
//	@Override
//	public String bookCab(String source, String dest) {
//	
//		System.out.println("Ola is booked from"+" "+source+" "+dest);
//		return ("Price: 5000Rs");
//	}
//	
//}

class Test {
	public static void main(String[] args) {
		 
		 Cab cab=(String source,String dest)->{("Ola is booked from"+" "+source+" "+dest);
			 return ("Price: 5000Rs"); 
			cab.bookCab("Blore", "Mum"); 
		 }
		
	}
}
