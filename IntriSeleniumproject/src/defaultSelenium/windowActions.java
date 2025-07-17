package defaultSelenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class windowActions {

	public static void main(String[] args) {
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url ="https://rahulshettyacademy.com/dropdownsPractise/";
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement statcielement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(statcielement);
		
		dropdown.selectByIndex(3);
		 Actions ac = new Actions(driver);
		
				 
		
				 
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.switchTo().alert().accept();
	}
	
}
