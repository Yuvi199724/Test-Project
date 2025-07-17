package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	
	{
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		String url1 ="https://www.spicejet.com/";
		
		driver.get(url1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'one way')]")).click();
		
		
	WebElement returndate =	driver.findElement(By.xpath("(//div[@data-testid=\"return-date-dropdown-label-test-id\"]//div[@style=\"font-family: inherit;\"])[1]"));
	
	if(returndate.equals(url1))
	{
		System.out.println("it is enabled");
		Assert.assertTrue(false);
		
	}
	else
	{
		Assert.assertTrue(true);
	}
		
		driver.quit();
		

	}

}
