package webautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest {
	WebDriverWait explicitWait;
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless","--disable-gpu","--window-size=1920,1200");
		driver = new ChromeDriver(options);
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		driver.get("https://id.hm.com/");
		driver.manage().window().maximize();
		
	}

	@AfterMethod
	public void quitChromeDriver() {
		 driver.quit();
		
	}

}

