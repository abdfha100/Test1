package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class M1 {
	private static Logger log = LogManager.getLogger(M1.class.getName());
	public static void main(String[] args) {
		
		log.debug("I have clicked on button");
		if(5>4)
		log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Button is missing");
		
	}
}
