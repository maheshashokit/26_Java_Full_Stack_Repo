public abstract class ExportAsPdf {
	
	//Defining the Fields
	public String fileName;
	
	//Defining the Constructor
	public ExportAsPdf() {
		System.out.println("ExportAsPdf Class Public Non-Parameterized Constructor.....");
	}
	
	//Defining the Parameterized Constructor
	public ExportAsPdf(String fileName) {
		System.out.println("ExportAsPdf Class Parameterized Constructor....");
		this.fileName = fileName;
	}
	
	//Defining the business method for displaying filename
	public void displayFileName() {
		System.out.println("File Name ::::::" + fileName);
	}
	
	//Defining the Abstract Method having multiple implementation from different vendors
	public abstract void downloadPdf();
	
}