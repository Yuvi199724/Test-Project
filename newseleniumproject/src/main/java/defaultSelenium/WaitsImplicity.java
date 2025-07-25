package defaultSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitsImplicity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();

		String rul = "https://rahulshettyacademy.com/seleniumPractise/";

		driver.get(rul);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();

			if (name.contains("Tomato")) {
				driver.findElements(By.xpath("//button[contains(.,'ADD TO CART')]")).get(i).click();
			}
			Thread.sleep(5000);
			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[contains(.,'ADD TO CART')]")).get(i).click();
			}
		}
//		String Actualcount = "//td[contains(.,'Items')]/../td[contains(.,'2')]";
//		String ExpCount = "//td[contains(.,'Items')]/../td[contains(.,'2')]";
//		
//		Assert.assertEquals(Actualcount, ExpCount);
		
		WebDriverWait wb  = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wb.until(ExpectedConditions.visibilityOf(null))
		
		
		driver.quit();

	}

}
