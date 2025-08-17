package factoryMethodPatternExample;

public class Test {

	public static void main(String[] args) {
		DocumentFactory f = new WordFactory();
		Document d1 = f.createDocument();
		System.out.println(d1.open());
		
		f = new PdfFactory();
		Document d2 = f.createDocument();
		System.out.println(d2.open());
		
		f = new ExcelFactory();
		Document d3 = f.createDocument();
		System.out.println(d3.open());
	}

}
