package webautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.HardWaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class RegistrationPositiveTest extends BaseWebTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void user_login_with_correct_credentials_and_correct_password_format() {

 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
 		driver.findElement(By.xpath("//div[@class='panel header']//div[@class='inputwrapper join']//button[@name='send']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'panel header')]//input[@id='firstname']")).sendKeys("Jajang"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='lastname']")).sendKeys("Ruhiat");
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email_address']")).sendKeys("ge32n2tor2868@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-register-pass']")).sendKeys("4ll574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='register-input-custom']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//div[@id='popup-mpdal-register']//span[contains(text(),'Bergabunglah dengan Kami')]")).click();
		HardWaitUtils.hardWait(8);
		String actualText = driver.findElement(By.xpath("//label[normalize-space()='Buat Akun']")).getText();
		String expectedText = "Buat Akun";
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));
		

    }
  
}
