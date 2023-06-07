package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyingDemo {

	public static void main(String[] args) throws IOException {

		// Taking the source file name & destination file name using DataInputStream
		// Class
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter Source Name File To Copy the File Content!!!");
			String sourceFileName = sc.next();// ashokit.txt

			System.out.println("Enter destination Name File To Copy the File Content!!!");
			String destinationFileName = sc.next(); // maheshit.txt
			
			try (FileInputStream fis = new FileInputStream(sourceFileName);
				 
				 FileOutputStream fos = new FileOutputStream(destinationFileName, true);) {

				// write logic for getting the content from source file
				byte[] sourceFileData = fis.readAllBytes();

				// copying the data into destination file
				fos.write(sourceFileData);

				System.out.println("File Data Got Copied Verify Files Oncess......");
			}
		  } catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
