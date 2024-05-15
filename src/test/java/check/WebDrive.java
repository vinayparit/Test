package check;

public interface WebDrive extends SearchContext, TakeScreenShot, JavaScriptExecutor {

	
	public void close();

	public void manage();

	public void get(String Url);

	public void navigate();

	public void getclass();

	public void getCurrentUrl();

	public void getPageSource();

	public void getWindowHandle();

	public void getWindowHandles();

	public void getTitle();

	public void switchTo();

	public void quit();

}
