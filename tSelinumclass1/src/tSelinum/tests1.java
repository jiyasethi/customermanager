package tSelinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // this is giving the location of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moavia computer\\Desktop\\Sellbrowserdrivers\\chromedriver_win32\\chromedriver.exe");
	
		// opens the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this will open the website
		driver.get("https://rediff.com");
		
		String ecurl = "https://www.rediff.com/";
		String acurl = driver.getCurrentUrl();	
		System.out.println(acurl);
		
		
		if(ecurl.equals(acurl)) {
		System.out.println("TC is pass");
		}
		else {
		System.out.println("TC is fail");
	}
	}
}
