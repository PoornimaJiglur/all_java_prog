package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String login=driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).getText();
		String reg1=driver.findElement(By.xpath("//a[contains(text(),'Register')]")).getText();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'gender-female')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'FirstName')]")).sendKeys("poornima");
		driver.findElement(By.xpath("//input[contains(@id, 'LastName')]")).sendKeys("J");
		driver.findElement(By.xpath("//input[contains(@id, 'Email')]")).sendKeys("poornima.j11@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@type, 'password')])[1]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[contains(@name, 'ConfirmPassword')]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[contains(@name, 'register-button')]")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'email')]")).sendKeys("poornima.j8@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'password')]")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();*/
		String reg=driver.findElement(By.xpath("//a[contains(text(),'poornima.j11@gmail.com')]")).getText();
		
		
		String logout=driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).getText();
		
		if(login==logout && reg==reg1)
		{
			System.out.println("login unsuccessful");
		}
		else
		{
			System.out.println("Login successful");
		}
	}

}
