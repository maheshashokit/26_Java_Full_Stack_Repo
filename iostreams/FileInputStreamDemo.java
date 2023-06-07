package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		File f = new File("ashokit-1.txt");
		
		if(f.exists() && f.canRead()) {			
			try (FileInputStream fileInputStream = new FileInputStream(f);) {
	
				// Read bytes from the file
				int data;
				System.out.println("Available Bytes:::::" + fileInputStream.available());
				while ((data = fileInputStream.read()) != -1) {
					// Converting the byte data into character
					System.out.print((char) data);
				}
	
			    System.out.println("\nData Reading Successfully.....");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("File May not be available or doesn't have read permission....");
		}

	}

}
