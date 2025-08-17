package financialForecasting;

public class Test {

	public static void main(String[] args) {
		ForecastCalculator f = new ForecastCalculator();
		double res = f.calculate(10000, 3, 0.05);
		System.out.printf("\nPredicted Future Value: %.2f", res );
		
		res = f.calculate(10000, 0, 0.05);
		System.out.printf("\nPredicted Future Value: %.2f", res );
	}

}
