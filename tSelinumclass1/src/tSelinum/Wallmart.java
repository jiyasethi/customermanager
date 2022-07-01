package tSelinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wallmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moavia computer\\Desktop\\Sellbrowserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
	
	WebElement searchbox = driver.findElement(By.id("gh-ac"));
	
	searchbox.sendKeys("Cars");
		
		
		
		
		
		
		
	}

}
