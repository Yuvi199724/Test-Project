package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		String URL1 = "https://rahulshettyacademy.com/dropdownsPractise/";
		
		driver.get(URL1);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		WebElement from =driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		System.out.println(from.getText());
		Thread.sleep(3000);
		from.isDisplayed();
		from.click();
//		
		driver.findElement(By.xpath("(//li//a[contains(.,' Bengaluru (BLR)')])[1]")).isDisplayed();
		driver.findElement(By.xpath("(//li//a[contains(.,' Bengaluru (BLR)')])[1]")).click();
//		Thread.sleep(3000);
		System.out.println(from.getText());
		
		WebElement To =driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		System.out.println(To.getText());
		To.isDisplayed();
		To.click();
		driver.findElement(By.xpath("(//li//a[contains(.,' Goa (GOI)')])[2]")).isDisplayed();
		driver.findElement(By.xpath("(//li//a[contains(.,' Goa (GOI)')])[2]")).click();
		Thread.sleep(3000);
		System.out.println(To.getText());
		
		
		
		
		
	}

}
