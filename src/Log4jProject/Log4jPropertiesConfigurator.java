package Log4jProject;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesConfigurator {
	
public static void main(String sa[]) {
		
		Logger log = Logger.getLogger(TestLog4jdebugLog.class);
		
		Date d = new Date();
		
		System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
		
		PropertyConfigurator.configure("C:\\Users\\AvenjR\\eclipse-workspace\\SeliniumProject\\src\\Properties\\log4j.properties");

		// debug level log.	
		log.debug("debug log");
		log.error("Error log.");
		log.info("Info log");

	}
}
