package saturday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 List<WebElement> capitals = driver.findElements(By.xpath("//div[contains(@id,'box') and @class=\"dragableBox\"]"));
		Actions actions=new Actions(driver);
		List<WebElement> countries = driver.findElements(By.xpath("//div[contains(@id,'box10') and @class=\"dragableBoxRight\"]"));
		for(int i=0;i<countries.size();i++)
		{
			actions.dragAndDrop(null, null)
		}

	}

}
