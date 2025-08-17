package factoryMethodPatternExample;

public class ExcelDocument implements Document {
	public String open() {
		return "Excel Document has been created!";
	}
}
