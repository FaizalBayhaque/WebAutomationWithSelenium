package webautomation.portofolio;

import org.testng.annotations.Test;

import utils.HardWaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class RegistrationNegativeTest extends BaseWebTestHeadless{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void user_regist_with_valid_credentials_but_with_incorrect_password_format() {
    	 WebDriver driver = new ChromeDriver();
    	 
    	driver.get("https://id.hm.com/");
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
 		driver.findElement(By.xpath("//div[@class='panel header']//div[@class='inputwrapper join']//button[@name='send']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'panel header')]//input[@id='firstname']")).sendKeys("Jajang"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='lastname']")).sendKeys("Ruhiat");
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email_address']")).sendKeys("generator88@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-register-pass']")).sendKeys("4ll574"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='register-input-custom']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//div[@id='popup-mpdal-register']//span[contains(text(),'Bergabunglah dengan Kami')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@data-bind='html: message.text']")).getText();
		String expectedText = "The password needs at least 8 characters. Create a new password and try again.";
		System.out.println(expectedText);
    }
    @Test
    public void user_regist_with_invalid_credentials_but_with_correct_password_format() {

    	 WebDriver driver = new ChromeDriver();
    	 
 		driver.get("https://id.hm.com/");
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
 		driver.findElement(By.xpath("//div[@class='panel header']//div[@class='inputwrapper join']//button[@name='send']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'panel header')]//input[@id='firstname']")).sendKeys("Jajang"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='lastname']")).sendKeys("Ruhiat");
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email_address']")).sendKeys("generator88gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-register-pass']")).sendKeys("4ll574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='register-input-custom']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//div[@id='popup-mpdal-register']//span[contains(text(),'Bergabunglah dengan Kami')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@data-bind='html: message.text']")).getText();
		String expectedText = "\"Email\" bukan alamat email yang valid.";
		System.out.println(expectedText);
		
    }
}
