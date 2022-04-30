package webautomation.portofolio;

import org.testng.annotations.Test;

import utils.HardWaitUtils;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


/**
 * Unit test for simple App.
 */
public class AddToCartWithoutRegisterTest extends BaseWebTestHeadless{
    /**
     * Rigorous Test :-)
     * 
     */
    @Test
    public void non_registered_user_able_addtocart () {
    	WebDriver driver = new ChromeDriver();
    	JavascriptExecutor scroll = (JavascriptExecutor) driver;
    	
 		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("celana cargo"); 
		driver.findElement(By.xpath("//button[@title='Pencarian']")).click();
		scroll.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//span[normalize-space()='Cotton cargo joggers']")).click();
		scroll.executeScript("window.scrollBy(0,200)");
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//div[@id='picker-1']//button[@type='button']")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//li[@class='size937']//button[@class='option']")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
		scroll.executeScript("window.scrollBy(0,-300)");
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//a[@class='action showcart2']//span[@class='text'][normalize-space()='Tas Belanja']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Lanjut ke Pembayaran']")).click();
		scroll.executeScript("window.scrollTo(0,350, document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[@href='https://id.hm.com/id_id/checkout/?cust=guestcheckout']")).click();
		

    }
  
}
