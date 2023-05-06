//This is child class of ExportAsPdf Class
public class ApachePdf extends ExportAsPdf {

	// Defining the Constructor
	public ApachePdf() {
		System.out.println("ITextPDF Class Non-Param Constructor....");
	}

	// Defining the Parameterized Constructor
	public ApachePdf(String fileName) {
		super(fileName);
	}

	@Override
	public void downloadPdf() {
		System.out.println("Implementation Logic From Apache Software Foundation");
	}
}
