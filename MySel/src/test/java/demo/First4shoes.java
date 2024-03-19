package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First4shoes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Adidas Shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
			List<WebElement> shoesname= driver.findElements(By.xpath("//a[@class=\"IRpwTa\"]"));
			System.out.println(shoesname.size());
		
			//for-each loop
			for (WebElement name : shoesname) {
				System.out.println(name.getText());
				
			}
			
			/*
			 
			 for(int i=0;i<shoesname.size();i++)
			{
				String shoesnamelist = shoesname.get(i).getText();
				System.out.println(shoesnamelist);
			}
			System.out.println(shoesname1);
		String shoesname2 = driver.findElement(By.xpath("(//a[@class=\"IRpwTa\"])[2]")).getText();
		System.out.println(shoesname2);
		String shoesname3 = driver.findElement(By.xpath("(//a[@class=\"IRpwTa\"])[2]")).getText();
		System.out.println(shoesname3);
		String shoesname4 = driver.findElement(By.xpath("(//a[@class=\"IRpwTa\"])[2]")).getText();
		System.out.println(shoesname4);*/

	}

}
