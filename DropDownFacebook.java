package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		//Day Dropdown
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayOptions=new Select(dayDropDown);
		List<WebElement> dayList = dayOptions.getOptions();
		for(WebElement day:dayList)
		{
			System.out.println(day.getText());
		}
		dayOptions.selectByIndex(3);
		Thread.sleep(3000);
		dayOptions.selectByValue("24");
		Thread.sleep(3000);
		dayOptions.selectByVisibleText("4");
		
		//Month Dropdown
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthOptions=new Select(monthDropDown);
		List<WebElement> monthList = monthOptions.getOptions();
		for(WebElement month:monthList)
		{
			System.out.println(month.getText());
		}
		monthOptions.selectByIndex(3);
		Thread.sleep(3000);
		monthOptions.selectByValue("4");
		Thread.sleep(3000);
		monthOptions.selectByVisibleText("Jun");
		
		//year Dropdown
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearOptions=new Select(yearDropDown);
		List<WebElement> yearList = yearOptions.getOptions();
		for(WebElement year:yearList)
		{
			System.out.println(year.getText());
		}
		yearOptions.selectByIndex(3);
		Thread.sleep(3000);
		yearOptions.selectByValue("2023");
		Thread.sleep(3000);
		yearOptions.selectByVisibleText("2022");
		
		
		
	}

}
