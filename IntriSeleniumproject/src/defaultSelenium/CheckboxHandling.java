package defaultSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args)
	{
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		String URL1 = "https://rahulshettyacademy.com/dropdownsPractise/";
		
		driver.get(URL1);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id(URL1)).click();
		
		System.out.print(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click());
		System.out.print(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		
		List<WebElement> checkboxsize = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		checkboxsize.size();
		System.out.print(checkboxsize.size());
		
		driver.quit();
		
		

	}

}
