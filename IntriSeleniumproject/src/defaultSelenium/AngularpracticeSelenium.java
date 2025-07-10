package defaultSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AngularpracticeSelenium {

	public static void main(String[] args) {
		 
		 System.setProperty("ChromeDriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
			ChromeDriver driver = new ChromeDriver(); 
			
			String url1 ="https://rahulshettyacademy.com/dropdownsPractise/";
			
			driver.get(url1);
			

	}

}
