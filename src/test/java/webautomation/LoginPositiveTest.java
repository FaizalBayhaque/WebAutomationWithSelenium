package webautomation;

import org.testng.annotations.Test;

import utils.HardWaitUtils;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


/**
 * Unit test for simple App.
 */
public class LoginPositiveTest extends BaseWebTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void registered_user_able_addtocart() {
    	
    
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("generator1@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("4ll574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5);
		String actualText = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Keluar']")).getText();
		String expectedText = "Keluar";
		System.out.println(expectedText);
		Assert.assertTrue(actualText.contains(expectedText));
    }
  
}

