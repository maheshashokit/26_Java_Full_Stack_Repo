
public class AbstractModifierClient {

	public static void main(String[] args) {
		
		//Creating object of Abstract class
		ExportAsPdf eas  = new ITextPdf("ashokit.pdf");//calling Child class constructor
		
		//calling the download functionality
		eas.downloadPdf();
		
		//calling the displayFileName
		eas.displayFileName();
		
		System.out.println("*******************************************");
		
		//creating child object of Abstract class
		eas = new ApachePdf("maheshit.pdf");
		
		//calling the download functionality
		eas.downloadPdf();
		
		//calling the display fileName
		eas.displayFileName();
		
	}
}
