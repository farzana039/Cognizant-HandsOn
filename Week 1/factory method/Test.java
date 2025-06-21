public class Test {
    public static void main(String[] args) {
        DocumentFactory pdf = new PdfFactory();
        Document pdfDoc = pdf.createDocument();
        pdfDoc.open();

        DocumentFactory word = new WordFactory();
        Document wordDoc = word.createDocument();
        wordDoc.open();

        DocumentFactory excel = new ExcelFactory();
        Document excelDoc = excel.createDocument();
        excelDoc.open();
    }
}


