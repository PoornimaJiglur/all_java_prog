package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttribute_Xpath {


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"q\"]")).sendKeys("iphone");
			driver.findElement(By.xpath("//input[@type=\"tex\" or @name=\"q\"]")).sendKeys("iphone");
			driver.findElement(By.xpath("//button[@class=\"_2iLD__\" and @type=\"submit\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"_4rR01T\" and text()=\"Apple iPhone 14 (Starlight, 128 GB)\"]")).click();
			
				

	}

}
