package decoratorPatternExample;

public class Test {

	public static void main(String[] args) {
		
		Notifier n1 = new EmailNotifier();
		System.out.println(n1.send("Your order has been shipped."));
		
		n1 = new SMSNotifierDecorator(n1);
		System.out.println(n1.send("Your order has been shipped."));
		
		n1 = new SlackNotifierDecorator(n1);
		System.out.println(n1.send("Your order has been shipped."));

	}

}
