package adapterPatternExample;

public class PaypalAdapter implements PaymentProcessor{

	PaypalGateway p = new PaypalGateway();
	@Override
	public String processPayment(double amount) {
		return p.sendPayment(amount);
	}

}
