package saturday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverReliance {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		Actions actions=new Actions(driver);
		//movetoelement is will move element wherever the cursor is 
		actions.moveToElement(driver.findElement(By.xpath("//div[text()='Home Appliances']"))).perform();
		//actions.click(driver.findElement(By.partialLinkText("Robotic Vacuum Cleaners"))).perform();
		actions.moveToElement(driver.findElement(By.partialLinkText("Robotic Vacuum Cleaners"))).click().perform();
	
	
	
	
	}

}
