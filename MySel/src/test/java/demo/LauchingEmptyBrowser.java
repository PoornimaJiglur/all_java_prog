package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LauchingEmptyBrowser {

	public static void main(String[] args) {
	/*//case 2: Selenium version : - 3.141.59 and Webdrivermanager:-5.6.3
		//TO launch chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		//TO launch edge
		WebDriverManager.edgedriver().setup();
		WebDriver driver1=new EdgeDriver();
	
		//TO launch Firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2=new FirefoxDriver(); */
	 
		//Case 3:- selenim version 4.17.0, no need to use webdrive manager
		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new EdgeDriver();
	
		
	}

}
