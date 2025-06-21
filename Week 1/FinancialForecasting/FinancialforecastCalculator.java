public class FinancialforecastCalculator {
    public double calculateforecast(double principle, int years, double rate) {
		if(years==0) {
            return principle;
        }
		else return calculateforecast(principle, years-1, rate)*(1 + rate);
	}
}
