package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Puma");
	driver.findElement(By.cssSelector("input[class=\"Pke_EE\"]")).click();
	
	
	
	}

}
