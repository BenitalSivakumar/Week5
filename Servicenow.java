package frame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Servicenow extends BaseClassInc{
	@Test
	public  void Service() {
		  
			driver.findElement(By.id("filter")).sendKeys("incident");
			driver.findElement(By.linkText("All")).click();
			

			WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
			driver.switchTo().frame(frame2);
			driver.findElement(By.id("sysverb_new")).click();
			String a=driver.findElement(By.id("incident.number")).getAttribute("value");
			System.out.println(a);
			driver.findElement(By.id("lookup.incident.caller_id")).click();
			

			Set<String> windowHandles = driver.getWindowHandles();
			List<String> win1 = new ArrayList<String>(windowHandles);
			driver.switchTo().window(win1.get(1));
			
			driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
			driver.switchTo().window(win1.get(0));
			driver.switchTo().frame(frame2);
			
			driver.findElement(By.id("lookup.incident.short_description")).click();
		
			driver.findElement(By.id("incident.short_description")).sendKeys("described as sweet and short");
			
			driver.findElement(By.id("sysverb_insert")).click();
			
			driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(a,Keys.ENTER);
			
			String b = driver.findElement(By.xpath("(//td[@class='vt']/a)[1]")).getText();
			if(a.equals(b))
			{
				System.out.println("Incident created");}
			else
				{
				System.out.println("create an incident");
				}
			driver.close(); 
			}
			
			
	
			
			
			
			
	}

