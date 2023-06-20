package iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter=null;
		try {
			// Create a FileWriter and wrap it with a BufferedWriter
			FileWriter fileWriter = new FileWriter("Students.txt",true);
			bufferedWriter = new BufferedWriter(fileWriter);

			// Write some text
			bufferedWriter.newLine();
			bufferedWriter.write("06,Suresh,AWS,15000");
			bufferedWriter.newLine(); // Write a new line

			System.out.println("Data written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufferedWriter != null) bufferedWriter.close();
		}
	}
}
