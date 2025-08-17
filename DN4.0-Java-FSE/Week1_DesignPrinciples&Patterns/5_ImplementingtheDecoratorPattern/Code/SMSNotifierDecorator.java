package decoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {
	
	public SMSNotifierDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public String send(String message) {
		return notifier.send(message) + "...Sending next via SMS";
	}
}
