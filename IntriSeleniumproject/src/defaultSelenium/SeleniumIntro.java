package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumIntro 
{

	public static void main(String[] args) throws InterruptedException 
	{
//	  invoking browser
		
	System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
	ChromeDriver driver = new ChromeDriver(); 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  
	
	driver.get("https://patinformed.wipo.int/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//*[@data-prefix=\"fas\" and @data-icon=\"magnifying-glass\"]")).isDisplayed();
	driver.findElement(By.xpath("//*[@data-prefix=\"fas\" and @data-icon=\"magnifying-glass\"]")).click();
	//driver.findElement(By.xpath("")).isDisplayed();
	
	
	driver.findElement(By.xpath("//button[contains(.,'I have read and agree to the terms')]")).isDisplayed();
	driver.findElement(By.xpath("//button[contains(.,'I have read and agree to the terms')]")).click();
	driver.findElement(By.xpath("//input[@class=\"searchField\"]")).sendKeys("paracetamol");
    driver.findElement(By.xpath("//*[@data-icon=\"magnifying-glass\"]")).click();
	driver.close();
	
	
	
	
	
	
	 
	
		

	}

}
