public class Test{
    public static void main(String args[]){
        FinancialforecastCalculator f = new FinancialforecastCalculator();
		double result = f.calculateforecast(50000, 5, 0.05);
		System.out.printf("\n Future Value: %.2f", result );
        result = f.calculateforecast(20500, 5, 0.02);
		System.out.printf("\n Future Value: %.2f", result );
    }
}