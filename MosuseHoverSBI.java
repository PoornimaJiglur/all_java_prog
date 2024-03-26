package saturday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MosuseHoverSBI {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("userName")).sendKeys("Poornima");
		Actions actions=new Actions(driver);
		//using send keys of actions class to pass the value
		actions.sendKeys(driver.findElement(By.id("password")),"poorni@123").perform();
		//using movetoelement to pass the value
		//actions.moveToElement(driver.findElement(By.id("password"))).click().sendKeys("poorni@123").perform();
		//using click method of actions class
		//actions.click(driver.findElement(By.id("password"))).perform();
		
		//movebyoffset is used to find the axis.. this will used to click on eye in the password field
		
	
		actions.moveByOffset(280, 0).click().perform();
		
		
	}

}
