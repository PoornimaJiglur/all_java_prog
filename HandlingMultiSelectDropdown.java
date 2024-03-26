package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.memory.Memory.GetDOMCountersResponse;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement courseDropDown = driver.findElement(By.id("cars"));
		Select coursePriceList=new Select(courseDropDown);
		System.out.println(coursePriceList.isMultiple());
		//gives all options including not selected
		List<WebElement> priceList = coursePriceList.getOptions();
		for(WebElement price:priceList)
		{
			coursePriceList.selectByVisibleText(price.getText());
		}
	//deselect the index 
		coursePriceList.deselectByIndex(3);
		Thread.sleep(2000);
		// deselect the value
		coursePriceList.deselectByValue("199");
		Thread.sleep(2000);
		//deselect all selected
		//coursePriceList.deselectAll();
		// gives first selected option from top to bottom
	//System.out.println(coursePriceList.getFirstSelectedOption().getText());
	//gives the only selected all options
	List<WebElement> selectedOptions = coursePriceList.getAllSelectedOptions();
	for(WebElement select:selectedOptions)
	{
		System.out.println(select.getText());
	}
	
	
	
	
	}

}
