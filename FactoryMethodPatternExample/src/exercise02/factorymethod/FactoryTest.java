package exercise02.factorymethod;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  DocumentFactory wordFactory = new WordFactory();
	        Document wordDoc = wordFactory.createDocument();
	        wordDoc.open();

	        DocumentFactory pdfFactory = new PdfFactory();
	        Document pdfDoc = pdfFactory.createDocument();
	        pdfDoc.open();

	        DocumentFactory excelFactory = new ExcelFactory();
	        Document excelDoc = excelFactory.createDocument();
	        excelDoc.open();

	}

}
