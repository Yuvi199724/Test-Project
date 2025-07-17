package defaultSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

	public static void main(String[] args) 
	
	{
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		String url1 ="https://www.spicejet.com/";
		
		driver.get(url1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
		
		driver.findElement(By.xpath("//div[contains(text(),'one way')]")).click();
		
		driver.quit();
		

	}

}
