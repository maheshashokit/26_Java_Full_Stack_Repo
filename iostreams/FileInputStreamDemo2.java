package iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("ashokit.txt");) {
		
			System.out.println("Available Bytes from File ::::" + fileInputStream.available());// 45

			byte[] readAllBytes = fileInputStream.readAllBytes();

			String fileContent = new String(readAllBytes);

			System.out.println(fileContent);
			
			System.out.println("\nData Reading Successfully.....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}