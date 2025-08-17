package adapterPatternExample;

public class PaypalGateway {
	public String sendPayment(double amount) {
		return "Payment made using PayPal.\n Amount: "+amount;
	}
}
