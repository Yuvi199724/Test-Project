package defaultSelenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingsXpath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver(); 

		
		String rulAutomationPractice = "https://rahulshettyacademy.com/AutomationPractice/";
		String LoginButtonxpath = "//button/following-sibling::button[contains(.,'Login')]";
		
		driver.get(rulAutomationPractice);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		boolean display = driver.findElement(By.xpath(LoginButton)).isDisplayed();
		try {
			WebElement loginbutton = driver.findElement(By.xpath(LoginButtonxpath));
			
			if(loginbutton.isDisplayed())
				System.out.println("Is Present");
			
			 String text = loginbutton.getText();
			loginbutton.click();
			System.out.println("Button Text:" + text);
			
			
		
		}
		catch(NoSuchElementException e){
			System.out.println("not found");
			
		}
		
		
		
		
		
//		if(display == true)
//		{
//			System.out.println("Is present");
//		}
//		 String text = driver.findElement(By.xpath(LoginButton)).getText();
//		driver.findElement(By.xpath(LoginButton)).click();
//		
//		System.out.println(text);
		
//		driver.quit();
		
		
	}}


