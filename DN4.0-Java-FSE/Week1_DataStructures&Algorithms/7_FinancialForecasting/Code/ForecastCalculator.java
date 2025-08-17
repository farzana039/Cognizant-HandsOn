package financialForecasting;

public class ForecastCalculator {
	
	public double calculate(double initialAmount, int years, double growthRate) {
		if(years==0) return initialAmount;
		else return calculate(initialAmount, years-1, growthRate)*(1 + growthRate);
	}
}
