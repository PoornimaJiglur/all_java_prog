package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameShortCut {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    //dot(.) is used only for class in CSS selector and dot should be given at the start of the class name and remove the space and give dot.
	    //driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("computer");
	    // # is used as shortcut for id in css selector
	    driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("book");

	}

}
