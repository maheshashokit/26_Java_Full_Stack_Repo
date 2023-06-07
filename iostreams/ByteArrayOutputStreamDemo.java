package iostreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args){

		String message = "Hi Welcome To Ashok IT Hyderabad";

		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();) {

			// Converting the String into byte[]
			byte[] bytes = message.getBytes();

			// writing byte array into memory
			byteArrayOutputStream.write(bytes);
			
			try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);){
			
				// Read bytes from the byte array
				int data;
				while ((data = byteArrayInputStream.read()) != -1) {
					// Process the byte data
					System.out.print((char) data);
				}
				System.out.println("\nData written to byte array successfully.");

				} catch (IOException e) {
					e.printStackTrace();
				}
	        }//ending outer try-with-resource
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
  }
}
