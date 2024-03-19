package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-DEL&gad_source=1&gclid=Cj0KCQiA84CvBhCaARIsAMkAvkIrRPSU7p0i1-pAEwcUkA20F0_uBMca6lajrZCrzN8TEWICSWCmvSYaAgkJEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		
		WebElement text = driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]"));
		text.sendKeys("Grapes", Keys.ENTER);
		String title= driver.findElement(By.xpath("(//div[contains(@class,'break')])[1]")).getText();
		System.out.println(title);
		

	}

}
