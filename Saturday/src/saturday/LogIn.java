package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("jiglurpoornima1@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("Poorni@123");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	}

}
