
public class Logger {
	
	private static Logger logger = null;
	
	public static Logger getInstance() {
		if(logger == null) {
			logger = new Logger(); }
		return logger;
	}
	
	public void info(String stringToPrint) {
		System.out.println(stringToPrint);
	}
	
}
