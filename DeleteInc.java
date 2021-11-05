package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteInc extends BaseClassInc{
	@Test
public void Delete() throws InterruptedException {

	driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
	driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	WebElement fram1=driver.findElement(By.id("gsft_main"));
	driver.switchTo().frame(fram1);
String b=driver.findElement(By.xpath("//tbody[@class='list2_body']//tr[4]//td[3]//a")).getText();
System.out.println(b);
driver.findElement(By.xpath("//tbody[@class='list2_body']//tr[4]//td[3]//a")).click();

driver.findElement(By.xpath("(//button[@class='form_action_button header  action_context btn btn-default'])[3]")).click();

driver.findElement(By.xpath("//button[@id='ok_button']")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(b,Keys.ENTER);

String text=driver.findElement(By.xpath("//tr[@class='list2_no_records']//td")).getText();


		if(text.contains("No records"))
			System.out.println("Inc deleted");
		driver.close(); 
}
}
