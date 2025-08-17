package singletonPatternExample;

public class Logger {
	private static Logger instance;
	
	private Logger() {
		System.out.println("Singleton instance created!");
	}
	
	public static synchronized Logger getInstance() {
		if(instance==null) instance = new Logger();
		return instance;
	}
}
