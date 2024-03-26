package saturday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingCOntextClickSBI {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Actions actions=new Actions(driver);
		//perform rightclick using contextclick method
		
		actions.contextClick(driver.findElement(By.partialLinkText("How Do I (Help)"))).perform();
		
		//perform rightclick using contextclick method in movetoelement
		//actions.moveToElement(driver.findElement(By.partialLinkText("How Do I (Help)"))).contextClick().perform();
		
		
	}

}
