package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateInc extends BaseClassInc{
	@Test
public  void update(){
	
		driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		WebElement fram2=driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(fram2);
	//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010030",Keys.ENTER)
		driver.findElement(By.xpath("(//td[@class='vt']/a)[1]")).click();

WebElement dro=driver.findElement(By.id("incident.state"));
Select obj=new Select (dro);
obj.selectByIndex(1);


WebElement dro1=driver.findElement(By.id("incident.urgency"));
Select obj1=new Select (dro1);
obj1.selectByIndex(0);

driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
String b=driver.findElement(By.xpath("//tbody[@class='list2_body']/tr/td[8]")).getText();
System.out.println(b);


if(b.contains("Progress"))
{
	System.out.println("incident is in progress");
}
else
	System.out.println("incident not created");

driver.close(); 













		
		
}
}
