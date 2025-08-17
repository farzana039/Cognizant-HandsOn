package decoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator {
	
	public SlackNotifierDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public String send(String message) {
		return notifier.send(message) + "....Sending next via Slack.";
	}
}
