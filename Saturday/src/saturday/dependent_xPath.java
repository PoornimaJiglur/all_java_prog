package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependent_xPath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		driver.findElement(By.xpath("//label[@for=\"Email\"]/following-sibling::input")).sendKeys("jiglurpoornima3@gmail.com");
		driver.findElement(By.xpath("//label[@for=\"Password\"]/following-sibling::input")).sendKeys("Poorni@123");
		driver.findElement(By.xpath("//input[@value='Log in']/parent::div/child::input")).click();
		

	}

}
