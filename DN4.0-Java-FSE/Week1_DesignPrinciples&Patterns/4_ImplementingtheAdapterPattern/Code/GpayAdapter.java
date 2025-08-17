package adapterPatternExample;

public class GpayAdapter implements PaymentProcessor{
	
	GpayGateway g = new GpayGateway();
	@Override
	public String processPayment(double amount) {
		return g.makePayment(amount);
	}

}
