package defaultSelenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumfullly {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		  String URL ="https://rahulshettyacademy.com"; 
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		

	}

}
 