package check;

public class RemoteWebDrive implements WebDrive{

	@Override
	public void close() {
		System.out.println("Close");
		
	}

	@Override
	public void manage() {
		
		System.out.println("manage");
	}

	@Override
	public void get(String Url) {
		System.out.println("get");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigate");
		
	}

	@Override
	public void getclass() {
		
		System.out.println("getclass");
	}

	@Override
	public void getCurrentUrl() {
		
		System.out.println("getCurrentUrl");
	}

	@Override
	public void getPageSource() {
		System.out.println("getPageSource");
		
	}

	@Override
	public void getWindowHandle() {
		System.out.println("getWindowHandle");
		
	}

	@Override
	public void getWindowHandles() {
		System.out.println("getWindowHandles");
		
	}

	@Override
	public void getTitle() {
		System.out.println("getTitle");
		
	}

	@Override
	public void switchTo() {
		System.out.println("switchTo");
		
	}

	@Override
	public void quit() {
		System.out.println("quit");
		
	}

	@Override
	public void findByElement() {
		System.out.println("findByElement");
		
	}

	@Override
	public void findByElements() {
		System.out.println("findByElements");
		
	}

	@Override
	public void getScreenShotAs() {
		System.out.println("getScreenShotAs");
		
	}

	@Override
	public void executeScript() {
		System.out.println("executeScript");
		
	}

	@Override
	public void executeAsyncScript() {
		System.out.println("executeAsyncScript");
		
	}

	
}
