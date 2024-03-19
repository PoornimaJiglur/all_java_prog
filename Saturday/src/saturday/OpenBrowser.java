package saturday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class OpenBrowser {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
String expected = "https://www.flipkart.com/";
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
Thread.sleep(3000);
String url=driver.getCurrentUrl();
System.out.println(url);

String title=driver.getTitle();
System.out.println(title);
//navigate.to is used to navigate to url. the difference between get and navigate is  get will navigate to url and will not give any option to go back and forward
// but navigate().to() will have option to navigate to the url and we can go back and forward
// navigate().to() wont wait till all webelements will load.
driver.navigate().to("https://www.flipkart.com/");


//String pageSource = driver.getPageSource();
//System.out.println(pageSource);

	//to validate the entered url is correct or not. storing expected url and comparing with current url
	if(expected.equalsIgnoreCase(url))
	{
		System.out.println("Test case Pass");
		
	}
	else
	{
		System.out.println("Test case Fail");
	}
	//close the current browser but in background still application will be running (check in task manager)
	//driver.close();
	//close the all browser, closing parent and child browser but in background also application will be close(task manager)
	driver.quit();
	}

	
}
