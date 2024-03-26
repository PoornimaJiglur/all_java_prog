package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		WebElement coffeeDropDown = driver.findElement(By.name("coffee"));
    
		//select class for dropdown
		Select coffeeSelctOptions=new Select(coffeeDropDown);
   // getoption() is used to get all list of options
		List<WebElement> coffeeList = coffeeSelctOptions.getOptions();
     for(WebElement coffee:coffeeList)
     {
    	 System.out.println(coffee.getText());
     }
     //select dropdown list by index number
     coffeeSelctOptions.selectByIndex(3);
     Thread.sleep(3000);
     //select dropdown list by value from html
     coffeeSelctOptions.selectByValue("sugar");
     Thread.sleep(3000);
     //select dropdown list by visible text from html
     coffeeSelctOptions.selectByVisibleText("With cream");
     Thread.sleep(3000);
     //to verify dropdown is multi select
     System.out.println(coffeeSelctOptions.isMultiple());
    
     
     
     
     
	}

}
