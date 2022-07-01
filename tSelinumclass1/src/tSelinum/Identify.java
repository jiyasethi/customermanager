package tSelinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moavia computer\\Desktop\\Sellbrowserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rediff.com/");
		driver.get("https://amazon.com/");
		
//	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchbox = driver.findElement(By.name("field-keywords"));
		searchbox.sendKeys("Customer service");
		
		//WebElement lt = driver.findElement(By.linkText("terms and conditions"));
		//lt.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
