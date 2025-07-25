package defaultSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();

		String URL1 = "https://rahulshettyacademy.com/dropdownsPractise/";

		driver.get(URL1);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement TypeCountry = driver.findElement(By.id("autosuggest"));
		TypeCountry.click();
		TypeCountry.sendKeys("IND");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li//a[@class='ui-corner-all']"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}
}
