package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Discover {

	public static void main(String[] args) {
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();

		String URL1 = "https://www.discover.com/";
		String YourName = "Yuvraj";
		driver.get(URL1);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(.,'Log In')][@type=\"button\"]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'User ID')][@id=\"user-id-input--popup-label\"]"))
				.isDisplayed();

		String Actual = "Secure Account Login";
		String Exp = "Secure Account Login";

		Assert.assertEquals(Actual, Exp);

		driver.findElement(By.xpath("//button[@data-testid=\"close\"]")).click();

		driver.quit();

	}

}
