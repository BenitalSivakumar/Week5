package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassInc {
	public static ChromeDriver driver;
	  
	  @BeforeMethod
	  public void precondition() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://dev50674.service-now.com/navpage.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(2000);
			WebElement fram=driver.findElement(By.id("gsft_main"));
			driver.switchTo().frame(fram);
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("admin");
			
			driver.findElement(By.id("user_password")).sendKeys("Phoebeumesh@24");
			Thread.sleep(2000);
			driver.findElement(By.id("sysverb_login")).click();
	  }
	  @AfterMethod
	  
		  public void postCondition() {
			  driver.close();  
		  
	  }}

