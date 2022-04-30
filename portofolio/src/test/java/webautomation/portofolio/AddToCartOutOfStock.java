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
public class AddToCartOutOfStock extends BaseWebTestHeadless {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void user_unable_addtocart_if_outofstock() {
    	
    	WebDriver driver = new ChromeDriver();
    	
 		driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link join hm-sign-in']")).click();
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-email']")).sendKeys("generator1@gmail.com"); 
		driver.findElement(By.xpath("//div[@class='panel header']//input[@id='popup-pass']")).sendKeys("4ll574R!"); 
		driver.findElement(By.xpath("//div[@class='panel header']//span[contains(text(),'Masuk')]")).click();
		HardWaitUtils.hardWait(5000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Linen Shirt Slim Fit"); 
		driver.findElement(By.xpath("//button[@title='Pencarian']")).click();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[3]/div[2]/div[6]/div[1]/div[1]/ol[1]/div[1]/li[3]/div[1]/div[2]/strong[1]/a[1]/span[1]")).click();
		scroll.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//div[@id='picker-1']//button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@class='fieldset']//div[@class='actions']")).click();
    }
  
}
