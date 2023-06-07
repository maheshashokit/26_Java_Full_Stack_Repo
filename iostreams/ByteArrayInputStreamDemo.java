package iostreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {

		byte[] byteArray = { 72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100 };

		try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);) {

			// Read bytes from the byte array
			int data;
			while ((data = byteArrayInputStream.read()) != -1) {
				// Process the byte data
				System.out.print((char) data);
			}

			System.out.println("\nData read from byte array successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
