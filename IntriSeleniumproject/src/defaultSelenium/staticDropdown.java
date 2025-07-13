package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown 
{

	public static void main(String[] args)
	{
	System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
	ChromeDriver driver = new ChromeDriver(); 
	
	String URL1 = "https://rahulshettyacademy.com/dropdownsPractise/";
	
	driver.get(URL1);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	
	  WebElement staticdropdown =  driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
	  
	  Select dropdown = new Select(staticdropdown);
	  dropdown.selectByIndex(3);
	  System.out.println(dropdown.getFirstSelectedOption().getText());
	  
	 dropdown.selectByVisibleText("AED");
	 System.out.println(dropdown.getFirstSelectedOption().getText());
	 
	 dropdown.selectByValue("INR");
	 System.out.println(dropdown.getFirstSelectedOption().getText());
	 
	 driver.manage().window().minimize();
	  driver.quit();
	
	
	
	

}
}