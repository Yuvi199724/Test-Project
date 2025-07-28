package defaultSelenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String rul = "https://rahulshettyacademy.com/seleniumPractise/";
		
		driver.get(rul);        
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println(driver.findElement(By.tagName("a")).getSize());
		
		
		
		
		System.out.println(driver.findElements(By.className("container")).size());
		driver.quit();
		

	}

}
