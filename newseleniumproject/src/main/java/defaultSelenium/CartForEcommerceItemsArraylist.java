package defaultSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartForEcommerceItemsArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String rul = "https://rahulshettyacademy.com/seleniumPractise/";
		
		String[] vegetablenames = {"Cucumber","Brocolli"};
		
		
		
		driver.get(rul);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		 
		 for(int i=0;i<products.size();i++)
		 {
			 String name = products.get(i).getText();
			 if(name.contains("Cucumber"))
			 {
				 driver.findElements(By.xpath("//button[contains(.,'ADD TO CART')]")).get(i).click();
			 }
		 }

	}

}
