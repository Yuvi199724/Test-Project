package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsjava {

	public static void main(String[] args) {

		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();

		String URL1 = "https://rahulshettyacademy.com/AutomationPractice/";
		String YourName = "Yuvraj";
		driver.get(URL1);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("name")).sendKeys(YourName);
		WebElement AlertBUttonDiplay = driver.findElement(By.id("alertbtn"));
		AlertBUttonDiplay.isDisplayed();
		AlertBUttonDiplay.click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys(YourName);
		WebElement AlertBUttonDiplay1 = driver.findElement(By.id("confirmbtn"));
		AlertBUttonDiplay1.isDisplayed();
		AlertBUttonDiplay1.click();
		String msg1 = driver.switchTo().alert().getText();
		System.out.println(msg1);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys(YourName);
		WebElement AlertBUttonDiplay2 = driver.findElement(By.id("confirmbtn"));
		AlertBUttonDiplay2.isDisplayed();
		AlertBUttonDiplay2.click();
		String msg2 = driver.switchTo().alert().getText();
		System.out.println(msg2);
		driver.switchTo().alert().dismiss();
		driver.quit();

	}

}
