package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatToAmzon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
       // driver.findElement(By.id("field-keywords")).sendKeys("cloths");
      //  driver.findElement(By.id("nav-search-submit-button")).click();
      //  driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.linkText("Today's")).click();
	
	//driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("shoes");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	
	}

}
