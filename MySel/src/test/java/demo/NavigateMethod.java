package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws Throwable 
	{
		//realtime getmethod will be used to launch browser as it loads all GUI
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://www.facebook.com");
		//navigate() method: Another way of lauching the application, its not reccommended in the realtime because it wont load all GUI methods 	
		driver.navigate().to("http://www.facebook.com");
//to make execution slower		
		Thread.sleep(2000);
		//to go backward 
		driver.navigate().back();
		Thread.sleep(2000);
		//to go forward 
		driver.navigate().forward();
		Thread.sleep(2000);
		// to refresh the page
		driver.navigate().refresh();
		//close()---> close the tab/window(single tab) where driver is currently in focus
        driver.close();		
        //quit()--> close all the tabs/windows including browser
        driver.quit();
	
	
	
	
	}

}
