package tSelinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testpagesource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moavia computer\\Desktop\\Sellbrowserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rediff.com");
		
//	String pgsrc =	driver.getPageSource();
	//	System.out.println(pgsrc);
		
	driver.navigate().to("https://google.com");
	 Thread.sleep(5000);
	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
