
package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.WebElement;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
			List<WebElement> iphonename= driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
			System.out.println(iphonename.size());
			
			List<WebElement> iphoneprice= driver.findElements(By.xpath("//div[contains(@class, \"_30jeq3 _1_WHN1\")]"));
		
		int count=0;	
		for (WebElement list : iphonename) {
				
			System.out.println("iPhone Name is : " + list.getText());
			System.out.println("iPhone price is : " + iphoneprice.get(count).getText());
			count++;
		}

		/*	for(int i=0;i<iphonename.size() && i<iphoneprice.size() ;i++)
			
		{
			String iphonenamelist = iphonename.get(i).getText();
			System.out.println(iphonenamelist);
			String iphonepricelist = iphoneprice.get(i).getText();
			System.out.println(iphonepricelist);
			
		} */
		
		driver.quit();
		
    	
		
		
	}

}
