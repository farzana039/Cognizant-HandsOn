package decoratorPatternExample;

public class EmailNotifier implements Notifier {
	
	public String send(String message) {
		return "Sending message via Email: "+ message;
	}
	
}
