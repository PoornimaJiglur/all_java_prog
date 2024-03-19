package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication {

	public static void main(String[] args) {
	
		//Launching Amazon using chrome
		WebDriver driver=new ChromeDriver();
		//method1 : used for launching an application
		driver.get("https://www.amazon.in/");
       //method 2: getTitle()--> fetching the title of the web page
		String title=driver.getTitle();
		System.out.println(title);
		//method 3: getCurrentUrl()--> it gives current url of the website
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		//method 4:getPageSource()--> it gives source code of web page
         String source=driver.getPageSource();
         System.out.println(source);
        //method 5:manage()-->used for manage the screen, maximize, minimize and fullscreen
/*         Options opt = driver.manage();
		 Window win=opt.window();
		 win.maximize(); */
		// we can write above 3 line code to 1 line
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//Launching flipkart using edge
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.flipkart.com/");
		String title1=driver1.getTitle();
		System.out.println(title1);

		// launching MakeMyTrip using firefox
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.makemytrip.com/");
		String title2=driver2.getTitle();
		System.out.println(title2); */
	}

}
