package iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {

		String data = "Welcome To Ashok IT Hyderabad Ameerpet!!!! \n";

		try (FileOutputStream fileOutputStream = new FileOutputStream("ashokit.txt",false);
			 BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);) {

			// Convert the string to bytes and write it to the file
			byte[] bytes = data.getBytes();

			// writing the byte[] into File
			bos.write(bytes);

	     	System.out.println("File Created Successfully in the Current Working Directory....");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
