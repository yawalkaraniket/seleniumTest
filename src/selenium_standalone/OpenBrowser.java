package selenium_standalone;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class OpenBrowser {

	public static void main(String args[]) {
		 
		Selenium selenium = new DefaultSelenium(StandaloneUtils.LOCALEHOST, StandaloneUtils.DEFAULT_PORT, StandaloneUtils.FIREFOX_BROWSER, "https://google.com");
		selenium.start();
		
	}
}
