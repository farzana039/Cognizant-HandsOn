package factoryMethodPatternExample;

public class PdfDocument implements Document {
	public String open() {
		return "Pdf Document had been created!";
	}
}
