package Log4jProject;

import org.apache.log4j.Logger;

public class TestLog4jdebugLog {

		 
	public static void main(String sa[]) {
		
		Logger log = Logger.getLogger(TestLog4jdebugLog.class);

		// debug level log.	
		log.debug("debug log");
		log.error("Error log.");
		log.info("Info log");

	}
}

