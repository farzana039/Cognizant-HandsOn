package adapterPatternExample;

public class Test {

	public static void main(String[] args) {
		
		PaymentProcessor g1 = new GpayAdapter();
		PaymentProcessor p1 = new PaypalAdapter();
		
		System.out.println(g1.processPayment(2500));
		System.out.println(p1.processPayment(1200));
		
	}

}
