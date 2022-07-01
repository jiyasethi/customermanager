package tSelinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tpagenews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moavia computer\\Desktop\\Sellbrowserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
//	String apagetitle =	driver.getTitle();
	//	System.out.println(apagetitle);
		
		driver.close();
	
		String pgsrc = driver.getPageSource();
		String esearchtext = "Read Latest India News";
		
		if(pgsrc.contains(esearchtext)) {
			
		System.out.println("TC2 is pass");
	}
		else {
			System.out.println("TC2 is fail");
		}

	}
	

}
