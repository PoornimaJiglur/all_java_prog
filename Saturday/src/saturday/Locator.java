package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws Throwable {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	/*driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Computer");
	driver.findElement(By.className("search-box-button")).click();*/
	
	/*driver.findElement(By.linkText("Register")).click();
	Thread.sleep(1000);
		
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Shopping cart")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Wishlist")).click();
	Thread.sleep(1000);*/
	driver.findElement(By.partialLinkText("Books")).click();
	
	driver.findElement(By.partialLinkText("Shopping")).click();
	Thread.sleep(1000);
	}

}
