//This is child class for ExportAsPdf Class
public class ITextPdf extends ExportAsPdf {
	
	//Defining the Constructor
	public ITextPdf() {
		System.out.println("ITextPDF Class Non-Param Constructor....");
	}
	
	//Defining the Parameterized Constructor
	public ITextPdf(String fileName) {
		super(fileName); //calling to super class
	}

	@Override
	public void downloadPdf() {
		System.out.println("Implementation Logic From IText");
	}
}