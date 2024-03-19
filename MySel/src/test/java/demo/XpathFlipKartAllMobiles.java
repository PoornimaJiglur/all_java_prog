package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipKartAllMobiles {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String title=driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).getText();
			System.out.println(title);
		

	}

}
