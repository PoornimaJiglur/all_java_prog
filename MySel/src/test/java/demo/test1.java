package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class=\"sc-eDvSVe gUjMRV\" and text()=\"Kids\"]")).click();
driver.findElement(By.xpath("//p[@class=\"sc-eDvSVe guezwa MenuItem__ParagraphBody-sc-1c49nqf-0 jjSmfp MenuItem__ParagraphBody-sc-1c49nqf-0 jjSmfp\" and text()=\"Soft Toys\"]")).click();
Thread.sleep(3000);
String toyname = driver.findElement(By.xpath("//p[@class=\"sc-eDvSVe gQDOBc NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ejhQZU NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ejhQZU\" and text()=\"Classy Kids Soft Toy\"]")).getText();
System.out.println(toyname);

String toyprice=driver.findElement(By.xpath("//h5[@class=\"sc-eDvSVe dwCrSh\" and text()=\"150\"]")).getText();
System.out.println(toyprice);


	}

}
