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
public class LoginPositiveTest extends BaseWebTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void registered_user_able_addtocart() {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://id.hm.com/");
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("generator1@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("4ll574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("celana cargo"); 
		driver.findElement(By.xpath("//button[@title='Pencarian']")).click();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//span[normalize-space()='Cotton cargo joggers']")).click();
		scroll.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//div[@id='picker-1']//button[@type='button']")).click();
		driver.findElement(By.xpath("//li[@class='size937']//button[@class='option']")).click();
		driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
		scroll.executeScript("window.scrollBy(0,-300)");
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//a[@class='action showcart2']//span[@class='text'][normalize-space()='Tas Belanja']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Lanjut ke Pembayaran']")).click();
		driver.findElement(By.xpath("//div[@class='step-title icon-valid']")).getText();
    }
  
}

