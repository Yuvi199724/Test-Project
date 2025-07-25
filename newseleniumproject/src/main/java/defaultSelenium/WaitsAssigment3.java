package defaultSelenium;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WaitsAssigment3 {

	public static void main(String[] args) {
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();

		String rul = "https://rahulshettyacademy.com/loginpagePractise/";
		String Username = "rahulshettyacademy";
		String Password = "learning";

		driver.get(rul);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);

		WebElement Student = driver.findElement(By.xpath("//select[@data-style=\"btn-info\"]"));
		Select std = new Select(Student);
		std.selectByVisibleText("Consultant");

		driver.findElement(By.xpath("//span[contains(.,'I Agree to the ')]")).click();

		driver.findElement(By.id("signInBtn")).isDisplayed();
		driver.findElement(By.id("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.switchTo().alert().accept();

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"card-title\"]"));

		for (int i = 0; i < products.size(); i++) 
		{
			String name = products.get(i).getText();
			
			if (name.contains("iphone X")) 
			{
				driver.findElements(By.xpath("//button[contains(.,'Add')]")).get(i).click();
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			if (name.contains("Samsung Note 8")) 
			{
				driver.findElements(By.xpath("//button[contains(.,'Add')]")).get(i).click();
			}
		}

//		driver.quit();

	}

}
