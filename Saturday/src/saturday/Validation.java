package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		
		String data="https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		
		
		
		
		if(data.equalsIgnoreCase(url))
		{
			System.out.println("demo URL navigated");
			boolean display = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).isDisplayed();
			if(display)
			{
				boolean enable = driver.findElement(By.xpath("//input[@type=\"submit\"]")).isEnabled();
				System.out.println("search is displayed");
				if(enable)
				{
					System.out.println("search is enabled");
					driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("mobile");
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
					
				}
				else
				{
					System.out.println("search is not enabled");
				}
			}
			else
			{
				System.out.println("search is not displayed");
			}
		
		}
		else
		{
			System.out.println("url is not correct");
		}
		
	}

}
