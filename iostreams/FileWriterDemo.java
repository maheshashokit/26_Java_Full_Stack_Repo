package iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) {

		// Creating the FileWriter Object
		try (Writer fw = new FileWriter("src/iostreams/ashokit.txt",true)) {

			String message = "Welcome To Mahesh IT Hyderabad For Corporate Training!!!!!!";

			// writing data into file writer
			fw.write(message);
			fw.write(222222);

			// calling the flush method
			fw.flush();

			System.out.println("File Data Got Written!!!!!");

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

}
