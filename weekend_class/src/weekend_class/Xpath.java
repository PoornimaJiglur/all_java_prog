package weekend_class;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://www.facebook.com/");
			driver.navigate().to("https://www.instagram.com/accounts/login/");
			driver.navigate().back();
			 String backURL=driver.getCurrentUrl();
			 System.out.println(backURL);
			 String backtitle=driver.getTitle();
			 System.out.println(backtitle);
			 // getWindowHandle() method gives address of current browser
			 System.out.println("Facebook address : " +driver.getWindowHandle());
			 driver.navigate().forward();
			 String fwdURL=driver.getCurrentUrl();
			 System.out.println(fwdURL);
			 String fwdtitle=driver.getTitle();
			 System.out.println(fwdtitle);
			 System.out.println("Instagram address : " +driver.getWindowHandle());
			 driver.close();
			 

	}

}
