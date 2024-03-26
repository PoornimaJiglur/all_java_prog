package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions=new Actions(driver);
		WebElement electronicsLink = driver.findElement(By.partialLinkText("Electronics"));
		actions.click(electronicsLink).perform();
		Thread.sleep(3000);
		WebElement actions1 = driver.findElement(By.partialLinkText("Camera, photo"));
		actions.click(actions1).perform();
		
		
		
	}

}
