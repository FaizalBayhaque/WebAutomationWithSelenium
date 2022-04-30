package webautomation.portofolio;

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
public class LoginNegativeTest extends BaseWebTestHeadless {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void user_login_with_incorect_email_and_incorrect_password() {

    	 WebDriver driver = new ChromeDriver();
    	
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("generator11@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("4ll54R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@class='panel header']//span[@class='input-info invalid button-validation-message'][normalize-space()='Tidak valid login atau kata sandi anda.']")).getText();
		String expectedText = "Tidak valid login atau kata sandi anda.";
		System.out.println(expectedText);
    }
    @Test
    public void user_login_with_correct_mail_but_with_incorrect_password() {

    	 WebDriver driver = new ChromeDriver();
    	 
 		driver.get("https://id.hm.com/");
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("generator1@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("4l574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@class='panel header']//span[@class='input-info invalid button-validation-message'][normalize-space()='Tidak valid login atau kata sandi anda.']")).getText();
		String expectedText = "Tidak valid login atau kata sandi anda.";
		System.out.println(expectedText);
    }
    @Test
    public void user_login_with_incorrect_email_but_with_correct_password() {

    	 WebDriver driver = new ChromeDriver();
    	 
 		driver.get("https://id.hm.com/");
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("generato1@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("4ll574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@class='panel header']//span[@class='input-info invalid button-validation-message'][normalize-space()='Tidak valid login atau kata sandi anda.']")).getText();
		String expectedText = "Tidak valid login atau kata sandi anda.";
		System.out.println(expectedText);
	}
    @Test
    public void user_login_with_both_email_and_password_form_empty() {

    	 WebDriver driver = new ChromeDriver();
    	 
 		driver.get("https://id.hm.com/");
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("  "); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("   "); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@class='panel header']//div[@id='popup-mpdal']//span[@class='input-info invalid button-validation-message'][contains(text(),'Formulir ini tidak dapat dikirimkan. Mohon untuk periksa kembali informasi Anda')]")).getText();
		String expectedText = "Formulir ini tidak dapat dikirimkan. Mohon untuk periksa kembali informasi Anda";
		System.out.println(expectedText);
    }	
  
}
