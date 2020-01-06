package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverOpening {

	public static void main(String a[]) {
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.navigate().to("http://google.co.in");
	}
}
 