package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger=LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\n Hello World...!   \n");
logger.info("Information message");
logger.error("Error message");
logger.warn("Warning message");
logger.fatal("Fatal message");
System.out.println("\n Completed");
	}

}
