package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		//xpath by Attribute
		//syntax 1 : //htmltag[@AttributeName="AttributeValue"]
		driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		
		//Syntax 2 : xpath by text
		//htmltag[text()="AttributeValue"]
		

	}

}
