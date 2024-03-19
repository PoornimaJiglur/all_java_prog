package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class CandyMapper {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Autocomplete")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Bhuvaneshwari Nagar");
		driver.findElement(By.xpath("//input[@id=\"street_number\"]")).sendKeys("2nd cross");
		driver.findElement(By.xpath("//input[@id=\"route\"]")).sendKeys("1st main");
		driver.findElement(By.xpath("//input[@placeholder=\"City\"]")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@id=\"administrative_area_level_1\"]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@id=\"postal_code\"]")).sendKeys("560093");
		driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Buttons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Primary')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Success')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Info')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Warning')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Danger')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Link')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"btnGroupDrop1\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'1')]")).click(); 

	}

}
