package check;

public class ChromeDrive extends RemoteWebDrive {

	public static void main(String[] args) {
		
		WebDrive rd=new ChromeDrive(); // Upcasting
		TakeScreenShot ts=(TakeScreenShot) rd; //Typecasting
		rd.close();
		ts.getScreenShotAs();
		SearchContext sc=(SearchContext) rd;
		sc.findByElements();
		ChromeDrive dr=(ChromeDrive) new RemoteWebDrive(); //Downcasting
		dr.getTitle();
		rd.getTitle();
	}

}
