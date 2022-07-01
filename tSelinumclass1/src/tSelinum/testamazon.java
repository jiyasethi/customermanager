package tSelinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testamazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moavia computer\\Desktop\\Sellbrowserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		String ecurl = "https://www.amazon.com/";
		String acurl = driver.getCurrentUrl();
		
		System.out.println(acurl);
		
		if(ecurl.equals(acurl)) {
		System.out.println("TC1 is pass");
		}
		else {
			System.out.println("TC1 is fail");
	}
	}
}
