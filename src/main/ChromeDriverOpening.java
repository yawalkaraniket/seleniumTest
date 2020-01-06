package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class ChromeDriverOpening {

	public static void main(String a[]) {
		
		//Creating a driver object referencing WebDriver interface
        WebDriver driver;
         
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "chromedriver_78.exe");
     
        //Instantiating driver object
        driver = new ChromeDriver();
         
        //Using get() method to open a webpage
        driver.get("http://google.com");
        
        driver.close();
	}
}
