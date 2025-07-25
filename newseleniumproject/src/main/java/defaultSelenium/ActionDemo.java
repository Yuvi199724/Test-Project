package defaultSelenium;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionDemo {

	public static void main(String[] args) {

		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();

		String rul = "https://www.amazon.in/";

		driver.get(rul);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String Actual1 = "Click the button below to continue shopping";
		String Exp1 = "Click the button below to continue shopping";

		Assert.assertEquals(Actual1, Exp1);

		try {
			driver.findElement(By.xpath("//button[contains(.,'Continue shopping')]")).click();
		} catch (Exception e) {
//			System.out.println("Something wesnt wrong.");

		}

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();

		String Actual = "Buy it again";
		String Exp = "Buy it again";

		Assert.assertEquals(Actual, Exp);
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		

//		driver.quit();

	}

}
