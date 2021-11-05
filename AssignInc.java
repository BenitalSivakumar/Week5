package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssignInc extends BaseClassInc{
	@Test
public  void Assign() throws InterruptedException {
		driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	WebElement fram2=driver.findElement(By.id("gsft_main"));
	driver.switchTo().frame(fram2);
//	driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010030",Keys.ENTER);
	
	driver.findElement(By.xpath("(//td[@class='vt']/a)[1]")).click();
	
	driver.findElement(By.id("sys_display.incident.assignment_group")).clear();
	driver.findElement(By.id("sys_display.incident.assignment_group")).sendKeys("Software");

Thread.sleep(2000);

	
	
	driver.findElement(By.id("activity-stream-textarea")).sendKeys("NA");
	
	driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	
	String a=driver.findElement(By.xpath("(//a[@class='linked'])[2]")).getText();
    System.out.println(a);
    if(a.contains("Software"))
    {
    	System.out.println("inputted correctly");
    }
    else
    	System.out.println("check again");
	
	
    driver.close(); 
}
}
