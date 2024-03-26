package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("jiglurpoornima3@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("Poorni@123");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	    driver.findElement(By.partialLinkText("Books")).click();
	    driver.findElement(By.linkText("Computing and Internet")).click();
	    driver.findElement(By.cssSelector("input[class=\"button-1 add-to-cart-button\"]")).click();
	    driver.findElement(By.cssSelector("a[class=\"ico-cart\"]")).click();
	    driver.findElement(By.name("termsofservice")).click();
	    driver.findElement(By.cssSelector("button[value=\"checkout\"]")).click();
	    
	   // driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]")).sendKeys("United States");
	    //driver.findElement(By.cssSelector("input[data-val-required=\"City is required\"]")).sendKeys("Austin");
	   // driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("2nd cross");
	   // driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("12345");
	   // driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("2312312312");
	    driver.findElement(By.cssSelector("input[onclick=\"Billing.save()\"]")).click();
	    Thread.sleep(2000);
	  	driver.findElement(By.cssSelector("input[onclick=\"Shipping.save()\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[onclick=\"ShippingMethod.save()\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[onclick=\"PaymentMethod.save()\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[onclick=\"PaymentInfo.save()\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[onclick=\"ConfirmOrder.save()\"]")).click();
	    
	    

	}

}
