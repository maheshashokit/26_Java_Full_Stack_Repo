package iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		try (FileInputStream fileInputStream = new FileInputStream("ashokit.txt");
			 BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			) {

			// Read bytes from the file
			int data;
			System.out.println("Available Bytes:::::" + fileInputStream.available());
			while ((data = bufferedInputStream.read()) != -1) {
				// Converting the byte data into character
				System.out.print((char) data);
			}

			System.out.println("\nData Reading Successfully.....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
